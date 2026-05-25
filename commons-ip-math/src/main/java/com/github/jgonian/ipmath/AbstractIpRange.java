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
import java.util.LinkedList;
import java.util.List;
import static java.math.BigInteger.ONE;
import static java.math.BigInteger.ZERO;

public abstract class AbstractIpRange<C extends AbstractIp<C, R>, R extends AbstractIpRange<C, R>> extends AbstractRange<C, R> implements InternetResourceRange<C, R> {

    protected static final String SLASH = "/";

    protected static final String DASH = "-";

    protected static final String DASH_WITH_SPACES = " - ";

    private static final BigInteger TWO = BigInteger.valueOf(2);

    protected AbstractIpRange(C start, C end) {
        super(start, end);
    }

    protected abstract R newInstance(BigInteger start, BigInteger end);

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String toStringInRangeNotation() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String toStringInRangeNotationWithSpaces() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String toStringInCidrNotation() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String toStringInDecimalNotation() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<R> splitToPrefixes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private int getMaximumPrefixLengthStartingAtIpAddressValue(BigInteger ipAddressValue, int startingPrefixLength) {
        int prefixLength = startingPrefixLength;
        while ((prefixLength >= 0) && !canBeDividedByThePowerOfTwo(ipAddressValue, prefixLength)) {
            prefixLength--;
        }
        return prefixLength;
    }

    private boolean canBeDividedByThePowerOfTwo(BigInteger number, int power) {
        return number.remainder(TWO.pow(power)).equals(ZERO);
    }
}
