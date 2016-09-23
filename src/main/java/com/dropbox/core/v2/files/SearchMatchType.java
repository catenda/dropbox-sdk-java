/* DO NOT EDIT */
/* This file was generated from files.stone */

package com.dropbox.core.v2.files;

import com.dropbox.core.stone.StoneSerializers;
import com.dropbox.core.stone.UnionSerializer;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import java.io.IOException;

/**
 * Indicates what type of match was found for a given item.
 */
public enum SearchMatchType {
    // union SearchMatchType
    /**
     * This item was matched on its file or folder name.
     */
    FILENAME,
    /**
     * This item was matched based on its file contents.
     */
    CONTENT,
    /**
     * This item was matched based on both its contents and its file name.
     */
    BOTH;

    /**
     * For internal use only.
     */
    static final class Serializer extends UnionSerializer<SearchMatchType> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(SearchMatchType value, JsonGenerator g) throws IOException, JsonGenerationException {
            switch (value) {
                case FILENAME: {
                    g.writeString("filename");
                    break;
                }
                case CONTENT: {
                    g.writeString("content");
                    break;
                }
                case BOTH: {
                    g.writeString("both");
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Unrecognized tag: " + value);
                }
            }
        }

        @Override
        public SearchMatchType deserialize(JsonParser p) throws IOException, JsonParseException {
            SearchMatchType value;
            boolean collapsed;
            String tag;
            if (p.getCurrentToken() == JsonToken.VALUE_STRING) {
                collapsed = true;
                tag = getStringValue(p);
                p.nextToken();
            }
            else {
                collapsed = false;
                expectStartObject(p);
                tag = readTag(p);
            }
            if (tag == null) {
                throw new JsonParseException("Required field missing: " + TAG_FIELD, p.getCurrentLocation());
            }
            else if ("filename".equals(tag)) {
                value = SearchMatchType.FILENAME;
            }
            else if ("content".equals(tag)) {
                value = SearchMatchType.CONTENT;
            }
            else if ("both".equals(tag)) {
                value = SearchMatchType.BOTH;
            }
            else {
                throw new JsonParseException("Unknown tag: " + tag, p.getCurrentLocation());
            }
            if (!collapsed) {
                expectEndObject(p);
            }
            return value;
        }
    }
}
