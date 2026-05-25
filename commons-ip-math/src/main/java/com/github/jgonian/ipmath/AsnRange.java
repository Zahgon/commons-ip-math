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

public final class AsnRange extends AbstractRange<Asn, AsnRange> implements InternetResourceRange<Asn, AsnRange> {

    protected AsnRange(Asn start, Asn end) {
        super(start, end);
    }

    @Override
    protected AsnRange newInstance(Asn start, Asn end) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static AsnRangeBuilder from(Long from) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static AsnRangeBuilder from(Asn from) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static AsnRangeBuilder from(String from) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static AsnRange parse(String text) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean containsOnly16BitAsns() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean containsOnly32BitAsns() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Long size() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class AsnRangeBuilder extends AbstractRangeBuilder<Asn, AsnRange> {

        private final Asn from;

        protected AsnRangeBuilder(Asn from) {
            this.from = from;
        }

        public AsnRange to(Long end) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public AsnRange to(String end) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public AsnRange to(Asn to) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
