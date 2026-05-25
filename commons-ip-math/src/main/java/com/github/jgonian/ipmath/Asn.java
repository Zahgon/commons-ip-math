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

public final class Asn implements SingleInternetResource<Asn, AsnRange>, Comparable<Asn> {

    private static final long serialVersionUID = -1L;

    private static final int SIXTEEN = 16;

    private static final int THIRTY_TWO = 32;

    public static final long ASN_MIN_VALUE = 0L;

    public static final long ASN_16_BIT_MAX_VALUE = (1L << SIXTEEN) - 1L;

    public static final long ASN_32_BIT_MAX_VALUE = (1L << THIRTY_TWO) - 1L;

    public static final Asn FIRST_ASN = Asn.of(ASN_MIN_VALUE);

    public static final Asn LAST_16_BIT_ASN = Asn.of(ASN_16_BIT_MAX_VALUE);

    public static final Asn LAST_32_BIT_ASN = Asn.of(ASN_32_BIT_MAX_VALUE);

    public static final int NUMBER_OF_BITS = THIRTY_TWO;

    private final long value;

    public Asn(Long value) {
        this.value = Validate.notNull(value, "value is required");
        Validate.checkRange(this.value, ASN_MIN_VALUE, ASN_32_BIT_MAX_VALUE);
    }

    long value() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Asn of(Long value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Asn of(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Parses a <tt>String</tt> into an {@link Asn}. The representation formats that are supported are
     * asplain, asdot+ and asdot as defined in RFC5396.
     *
     * @param text a string of an AS number e.g. "AS123", "AS0.123", "123" e.t.c.
     * @return a new {@link Asn}
     * @throws IllegalArgumentException if the string cannot be parsed
     * @see <a href="http://tools.ietf.org/html/rfc5396">RFC5396 -
     * Textual Representation of Autonomous System (AS) Numbers</a>
     */
    public static Asn parse(String text) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean is16Bit() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean is32Bit() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int compareTo(Asn other) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Asn next() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Asn previous() {
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
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public AsnRange asRange() {
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
    public boolean equals(Object o) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
