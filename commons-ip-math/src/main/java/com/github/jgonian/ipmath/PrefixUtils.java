/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2011-2017, Yannis Gonianakis
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.github.jgonian.ipmath;

import java.math.BigInteger;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import static java.math.BigInteger.ZERO;

public final class PrefixUtils {

    private PrefixUtils() {
    }

    public static <C extends AbstractIp<C, R>, R extends AbstractIpRange<C, R>> boolean isLegalPrefix(AbstractIpRange<C, R> range) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <C extends AbstractIp<C, R>, R extends AbstractIpRange<C, R>> int getPrefixLength(AbstractIpRange<C, R> range) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <C extends AbstractIp<C, R>, R extends AbstractIpRange<C, R>> Optional<R> findMinimumPrefixForPrefixLength(R range, int prefixLength) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <C extends AbstractIp<C, R>, R extends AbstractIpRange<C, R>> Optional<R> findMaximumPrefixForPrefixLength(R range, int prefixLength) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static <C extends AbstractIp<C, R>, R extends AbstractIpRange<C, R>> Optional<R> findPrefixForPrefixLength(R range, int prefixLength, Comparator<? super R> comparator) {
        List<R> prefixes = range.splitToPrefixes();
        Collections.sort(prefixes, comparator);
        for (R prefix : prefixes) {
            if (prefixLength >= PrefixUtils.getPrefixLength(prefix)) {
                return Optional.of(prefix);
            }
        }
        return Optional.empty();
    }

    // TODO(yg): generify and move to AbstractIp
    public static int findMaxPrefixLengthForAddress(Ipv6 address) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static int getMaxValidPrefix(BigInteger number) {
        int powerOfTwo = 0;
        int maxPowerOfTwo = powerOfTwo;
        while (powerOfTwo <= Ipv6.NUMBER_OF_BITS && number.divideAndRemainder(BigInteger.ONE.shiftLeft(powerOfTwo))[1].compareTo(ZERO) == 0) {
            maxPowerOfTwo = powerOfTwo;
            powerOfTwo++;
        }
        return Ipv6.NUMBER_OF_BITS - maxPowerOfTwo;
    }

    public static int sumIpv4Prefixes(List<Integer> ipv4Prefixes) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static int sumIpv6Prefixes(List<Integer> ipv6Prefixes) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static int doSumIpvX(List<Integer> prefixes, int bitSize) {
        double addressSize = 0;
        for (Integer prefix : prefixes) {
            Validate.checkRange(prefix, 1, bitSize);
            addressSize += Math.pow(2, bitSize - prefix);
        }
        return (int) Math.floor(bitSize - (Math.log(addressSize) / Math.log(2)));
    }

    public static <C extends AbstractIp<C, R>, R extends AbstractIpRange<C, R>> SortedSet<R> excludeFromRangeAndSplitIntoPrefixes(R originalRange, Set<R> rangesToExclude) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
