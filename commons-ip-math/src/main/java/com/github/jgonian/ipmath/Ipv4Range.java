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

public final class Ipv4Range extends AbstractIpRange<Ipv4, Ipv4Range> {

    private static final long serialVersionUID = 1L;

    protected Ipv4Range(Ipv4 start, Ipv4 end) {
        super(start, end);
    }

    @Override
    protected Ipv4Range newInstance(BigInteger start, BigInteger end) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    protected Ipv4Range newInstance(Ipv4 start, Ipv4 end) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Ipv4RangeBuilder from(Ipv4 from) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Ipv4RangeBuilder from(BigInteger from) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Ipv4RangeBuilder from(Long from) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Ipv4RangeBuilder from(String from) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Parses a <tt>String</tt> into an {@link Ipv4Range}.
     *
     * @param range a dash separated string of two IPv4 addresses e.g. "192.168.0.0-192.168.255.255"
     *              or a CIDR-notation string, e.g. "192.168.0.0/16"
     * @return a new {@link Ipv4Range}
     * @throws IllegalArgumentException if the string cannot be parsed
     * @see #parseCidr(String)
     */
    public static Ipv4Range parse(String range) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Parses a <tt>String</tt> of an IPv4 address and its subnet mask formatted as in a
     * Classless Inter-Domain Routing (CIDR) notation.
     *
     * @param cidrString a CIDR-notation string, e.g. "192.168.0.0/16"
     * @return a new {@link Ipv4Range}
     * @throws IllegalArgumentException if the string cannot be parsed
     * @see <a href="http://tools.ietf.org/html/rfc4632">rfc4632</a>
     */
    public static Ipv4Range parseCidr(String cidrString) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Ipv4Range parseDecimalNotation(String range) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Long size() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class Ipv4RangeBuilder extends AbstractRangeBuilder<Ipv4, Ipv4Range> {

        private final Ipv4 from;

        protected Ipv4RangeBuilder(Ipv4 from) {
            this.from = from;
        }

        public Ipv4Range to(BigInteger end) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Ipv4Range to(Long end) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Ipv4Range to(String end) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Ipv4Range andPrefixLength(String prefix) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Ipv4Range andPrefixLength(int prefixLength) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public Ipv4Range to(Ipv4 to) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
