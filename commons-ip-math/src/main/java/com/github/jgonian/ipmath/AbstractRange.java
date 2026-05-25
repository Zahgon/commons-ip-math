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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public abstract class AbstractRange<C extends Rangeable<C, R>, R extends Range<C, R>> implements Range<C, R> {

    private final C start;

    private final C end;

    protected AbstractRange(C start, C end) {
        this.start = Validate.notNull(start, "start of range must not be null");
        this.end = Validate.notNull(end, "end of range must not be null");
        Validate.isTrue(this.start.compareTo(this.end) <= 0, "Invalid range [" + start + ".." + end + "]");
    }

    protected abstract R newInstance(C start, C end);

    @Override
    public C start() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public C end() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean contains(R other) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean contains(C value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean overlaps(R other) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean isConsecutive(R other) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public R merge(R other) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public R intersection(R other) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private C max(C a, C b) {
        return a.compareTo(b) >= 0 ? a : b;
    }

    private C min(C a, C b) {
        return a.compareTo(b) <= 0 ? a : b;
    }

    @SuppressWarnings({ "unchecked" })
    @Override
    public List<R> exclude(R other) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean isSameRange(R other) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private boolean hasSameStart(R other) {
        return this.start.equals(other.start());
    }

    private boolean hasSameEnd(R other) {
        return this.end.equals(other.end());
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Iterator<C> iterator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private class RangeIterator implements Iterator<C> {

        private C nextValue = start;

        private boolean reachedTheEnd = false;

        @Override
        public boolean hasNext() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public C next() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    @Override
    public final boolean equals(Object o) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected abstract static class AbstractRangeBuilder<C extends Rangeable<C, R>, R extends AbstractRange<C, R>> {

        public abstract R to(C to);
    }
}
