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
import java.util.regex.Pattern;

public final class Ipv4 extends AbstractIp<Ipv4, Ipv4Range> {

    private static final long serialVersionUID = -1L;

    public static final int BYTE_MASK = 0xff;

    public static final int NUMBER_OF_BITS = 32;

    public static final long MINIMUM_VALUE = 0;

    public static final long MAXIMUM_VALUE = (1L << NUMBER_OF_BITS) - 1;

    public static final Ipv4 FIRST_IPV4_ADDRESS = Ipv4.of(MINIMUM_VALUE);

    public static final Ipv4 LAST_IPV4_ADDRESS = Ipv4.of(MAXIMUM_VALUE);

    private static final int TOTAL_OCTETS = 4;

    private static final int MAX_OCTET_VALUE = 255;

    private static final int MIN_OCTET_VALUE = 0;

    private static final int THREE_OCTETS = 24;

    private static final int TWO_OCTETS = 16;

    private static final int ONE_OCTET = 8;

    private static final String DEFAULT_PARSING_ERROR_MESSAGE = "Invalid IPv4 address: '%s'";

    private static final Pattern LEADING_ZERO_IN_IPV4 = Pattern.compile("(^|\\.)0[0-9]");

    private final Long value;

    protected Ipv4(Long value) {
        this.value = Validate.notNull(value, "value is required");
        Validate.isTrue(value.compareTo(MINIMUM_VALUE) >= 0, "Value of IPv4 has to be greater than or equal to " + MINIMUM_VALUE);
        Validate.isTrue(value.compareTo(MAXIMUM_VALUE) <= 0, "Value of IPv4 has to be less than or equal to " + MAXIMUM_VALUE + " was: " + value);
    }

    long value() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Ipv4 of(BigInteger from) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Ipv4 of(Long value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Ipv4 of(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Ipv4 parse(String ipv4Address) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static long addOctet(long value, int octet) {
        Validate.checkRange(octet, MIN_OCTET_VALUE, MAX_OCTET_VALUE);
        return ((value) << 8) | octet;
    }

    @Override
    public int compareTo(Ipv4 other) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /*@Override
    public boolean isValidNetmask() {
        int leadingOnesCount = Integer.numberOfLeadingZeros(~(int) value);
        int trailingZeroesCount = Integer.numberOfTrailingZeros((int) value);
        return leadingOnesCount > 0 && (leadingOnesCount + trailingZeroesCount) == IPv4_NUMBER_OF_BITS;
    }*/
    @Override
    public Ipv4 next() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Ipv4 previous() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean hasPrevious() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Ipv4Range asRange() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int bitSize() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public BigInteger asBigInteger() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Ipv4 lowerBoundForPrefix(int prefixLength) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Ipv4 upperBoundForPrefix(int prefixLength) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int getCommonPrefixLength(Ipv4 other) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(Object o) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
