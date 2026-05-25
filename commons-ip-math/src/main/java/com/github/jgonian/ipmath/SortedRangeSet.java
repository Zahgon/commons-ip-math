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

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SortedRangeSet<C extends Rangeable<C, R>, R extends Range<C, R>> implements Iterable<R> {

    private final NavigableSet<R> set;

    /**
     * Creates an instance of {@link SortedRangeSet} with a default
     * {@link StartAndSizeComparator} which compares only the start and end of the range.
     * <em>Note, this comparator imposes orderings that might be inconsistent with the equals
     * method of the compared ranges.</em>
     */
    public SortedRangeSet() {
        set = new TreeSet<R>(StartAndSizeComparator.<C, R>get());
    }

    public void addAll(SortedRangeSet<C, R> ranges) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void addAll(Collection<R> ranges) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void add(R range) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private void freeAndMergeConsecutive(R range) {
        R rightSide = set.higher(range);
        R leftSide = set.lower(range);
        if (!range.overlaps(rightSide) && !range.overlaps(leftSide)) {
            set.add(range);
        }
        if (range.overlaps(rightSide) || range.isConsecutive(rightSide)) {
            R merged = range.merge(rightSide);
            remove(rightSide);
            freeAndMergeConsecutive(merged);
        }
        if (range.overlaps(leftSide) || range.isConsecutive(leftSide)) {
            R merged = range.merge(leftSide);
            remove(leftSide);
            freeAndMergeConsecutive(merged);
        }
    }

    public void removeAll(SortedRangeSet<C, R> ranges) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void removeAll(Collection<R> ranges) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean remove(R range) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SortedRangeSet<C, R> intersection(SortedRangeSet<C, R> other) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final boolean equals(Object o) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean contains(R range) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void clear() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isEmpty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int size() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return an unmodifiable instance of this {@link SortedRangeSet} as a {@link Set}
     */
    public Set<R> unmodifiableSet() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return a modifiable copy of this {@link SortedRangeSet} as a {@link Set}
     */
    public Set<R> modifiableSet() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public R getSingleRange() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public R floor(R range) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public R ceiling(R range) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Iterator<R> iterator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
