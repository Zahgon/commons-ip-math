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

import static java.math.BigInteger.*;
import java.math.BigInteger;

public final class Ipv6Range extends AbstractIpRange<Ipv6, Ipv6Range> {

    private static final long serialVersionUID = 1L;

    protected Ipv6Range(Ipv6 start, Ipv6 end) {
        super(start, end);
    }

    @Override
    protected Ipv6Range newInstance(BigInteger start, BigInteger end) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    protected Ipv6Range newInstance(Ipv6 start, Ipv6 end) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Ipv6RangeBuilder from(Ipv6 from) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Ipv6RangeBuilder from(BigInteger from) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Ipv6RangeBuilder from(String from) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Parses a <tt>String</tt> into an {@link Ipv6Range}.
     *
     * @param range a dash separated string of two IPv6 addresses e.g. "2001:db8::1-2001:db8::2"
     *              or a CIDR-notation string, e.g. "2001:0db8:0:cd30::/60"
     * @return a new {@link Ipv6Range}
     * @throws IllegalArgumentException if the string cannot be parsed
     * @see #parseCidr(String)
     */
    public static Ipv6Range parse(String range) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Parses a <tt>String</tt> of an IPv6 address and its subnet mask formatted as in a
     * Classless Inter-Domain Routing (CIDR) notation.
     *
     * @param cidrString a CIDR-notation string, e.g. "2001:0db8:0:cd30::/60"
     * @return a new {@link Ipv6Range}
     * @throws IllegalArgumentException if the string cannot be parsed
     * @see <a href="http://tools.ietf.org/html/rfc4632">rfc4632</a>
     * @see <a href="http://tools.ietf.org/html/rfc4291#section-2.3">rfc4291 §2.3</a>
     */
    public static Ipv6Range parseCidr(String cidrString) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Ipv6Range parseDecimalNotation(String range) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public BigInteger size() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class Ipv6RangeBuilder extends AbstractRangeBuilder<Ipv6, Ipv6Range> {

        private final Ipv6 from;

        protected Ipv6RangeBuilder(Ipv6 from) {
            this.from = from;
        }

        public Ipv6Range to(BigInteger end) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Ipv6Range to(String end) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Ipv6Range andPrefixLength(String prefixLength) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Ipv6Range andPrefixLength(int prefixLength) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public Ipv6Range to(Ipv6 to) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
