// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for LineEnding. */
public final class LineEnding extends ExpandableStringEnum<LineEnding> {
    /** Static value space for LineEnding. */
    public static final LineEnding SPACE = fromString("space");

    /** Static value carriageReturn for LineEnding. */
    public static final LineEnding CARRIAGE_RETURN = fromString("carriageReturn");

    /** Static value lineFeed for LineEnding. */
    public static final LineEnding LINE_FEED = fromString("lineFeed");

    /** Static value carriageReturnLineFeed for LineEnding. */
    public static final LineEnding CARRIAGE_RETURN_LINE_FEED = fromString("carriageReturnLineFeed");

    /**
     * Creates or finds a LineEnding from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LineEnding.
     */
    @JsonCreator
    public static LineEnding fromString(String name) {
        return fromString(name, LineEnding.class);
    }

    /** @return known LineEnding values. */
    public static Collection<LineEnding> values() {
        return values(LineEnding.class);
    }
}