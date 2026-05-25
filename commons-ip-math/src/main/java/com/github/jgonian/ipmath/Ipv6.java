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
import static java.math.BigInteger.ONE;

public final class Ipv6 extends AbstractIp<Ipv6, Ipv6Range> {

    private static final long serialVersionUID = -1L;

    public static final BigInteger FOUR_OCTECT_MASK = BigInteger.valueOf(0xFFFF);

    public static final int NUMBER_OF_BITS = 128;

    public static final BigInteger MINIMUM_VALUE = BigInteger.ZERO;

    public static final BigInteger MAXIMUM_VALUE = new BigInteger(String.valueOf((ONE.shiftLeft(NUMBER_OF_BITS)).subtract(ONE)));

    public static final Ipv6 FIRST_IPV6_ADDRESS = Ipv6.of(MINIMUM_VALUE);

    public static final Ipv6 LAST_IPV6_ADDRESS = Ipv6.of(MAXIMUM_VALUE);

    private static final int MIN_PART_VALUE = 0x0;

    private static final int MAX_PART_VALUE = 0xFFFF;

    private static final int MAX_PART_LENGTH = 4;

    private static final String DEFAULT_PARSING_ERROR_MESSAGE = "Invalid IPv6 address: '%s'";

    private static final String COLON = ":";

    private static final String ZERO = "0";

    private static final int BITS_PER_PART = 16;

    private static final int TOTAL_OCTETS = 8;

    private static final int COLON_COUNT_IPV6 = 7;

    private static final BigInteger MINUS_ONE = BigInteger.valueOf(-1);

    private final BigInteger value;

    protected Ipv6(BigInteger value) {
        this.value = Validate.notNull(value, "value is required");
        Validate.isTrue(value.compareTo(MINIMUM_VALUE) >= 0, "Value of IPv6 has to be greater than or equal to " + MINIMUM_VALUE);
        Validate.isTrue(value.compareTo(MAXIMUM_VALUE) <= 0, "Value of IPv6 has to be less than or equal to " + MAXIMUM_VALUE);
    }

    BigInteger value() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Ipv6 of(BigInteger value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Ipv6 of(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int compareTo(Ipv6 other) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Ipv6 next() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Ipv6 previous() {
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
    public Ipv6Range asRange() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Parses a <tt>String</tt> into an {@link Ipv6} address.
     *
     * @param ipv6Address a text representation of an IPv6 address as defined in rfc4291
     * @return a new {@link Ipv6}
     * @throws NullPointerException if the string argument is <tt>null</tt>
     * @throws IllegalArgumentException if the string cannot be parsed
     * @see <a href="http://tools.ietf.org/html/rfc4291">rfc4291 - IP Version 6 Addressing Architecture</a>
     */
    public static Ipv6 parse(final String ipv6Address) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static String expandMissingColons(final String ipv6String, final int indexOfDoubleColons) {
        final int colonCount = countColons(ipv6String);
        Validate.isTrue(colonCount >= 2 && colonCount <= COLON_COUNT_IPV6 + 1);
        final int missingZeros = COLON_COUNT_IPV6 - colonCount + 1;
        String leftPart = ipv6String.substring(0, indexOfDoubleColons);
        String rightPart = ipv6String.substring(indexOfDoubleColons + 2);
        if (missingZeros == 0) {
            Validate.isTrue(leftPart.isEmpty() || rightPart.isEmpty());
        }
        if (leftPart.isEmpty()) {
            leftPart = ZERO;
        }
        if (rightPart.isEmpty()) {
            rightPart = ZERO;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(leftPart);
        for (int i = 0; i < missingZeros; i++) {
            sb.append(COLON).append(ZERO);
        }
        sb.append(COLON).append(rightPart);
        return sb.toString();
    }

    private static int countColons(String ipv6String) {
        int count = 0;
        for (char c : ipv6String.toCharArray()) {
            if (c == ':') {
                count++;
            }
        }
        return count;
    }

    private static String getIpv6AddressWithIpv4SectionInIpv6Notation(String ipv6String) {
        final int indexOfLastColon = ipv6String.lastIndexOf(COLON);
        final String ipv6Section = ipv6String.substring(0, indexOfLastColon);
        final String ipv4Section = ipv6String.substring(indexOfLastColon + 1);
        final Ipv4 ipv4 = Ipv4.parse(ipv4Section);
        final String ipv4FirstPart = Long.toHexString(ipv4.value() >>> BITS_PER_PART);
        final String ipv4SecondPart = Long.toHexString(ipv4.value() & MAX_PART_VALUE);
        return ipv6Section + COLON + ipv4FirstPart + COLON + ipv4SecondPart;
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
    public Ipv6 lowerBoundForPrefix(int prefixLength) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Ipv6 upperBoundForPrefix(int prefixLength) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private BigInteger bitMask(int prefixLength) {
        return ONE.shiftLeft(NUMBER_OF_BITS - prefixLength).add(MINUS_ONE);
    }

    @Override
    public int getCommonPrefixLength(Ipv6 other) {
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
