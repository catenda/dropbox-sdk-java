/* DO NOT EDIT */
/* This file was generated from files.stone */

package com.dropbox.core.v2.files;

import com.dropbox.core.stone.StoneSerializers;
import com.dropbox.core.stone.StructSerializer;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import java.io.IOException;

public class SearchMatch {
    // struct SearchMatch

    protected final SearchMatchType matchType;
    protected final Metadata metadata;

    /**
     *
     * @param matchType  The type of the match. Must not be {@code null}.
     * @param metadata  The metadata for the matched file or folder. Must not be
     *     {@code null}.
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public SearchMatch(SearchMatchType matchType, Metadata metadata) {
        if (matchType == null) {
            throw new IllegalArgumentException("Required value for 'matchType' is null");
        }
        this.matchType = matchType;
        if (metadata == null) {
            throw new IllegalArgumentException("Required value for 'metadata' is null");
        }
        this.metadata = metadata;
    }

    /**
     * The type of the match.
     *
     * @return value for this field, never {@code null}.
     */
    public SearchMatchType getMatchType() {
        return matchType;
    }

    /**
     * The metadata for the matched file or folder.
     *
     * @return value for this field, never {@code null}.
     */
    public Metadata getMetadata() {
        return metadata;
    }

    @Override
    public int hashCode() {
        int hash = java.util.Arrays.hashCode(new Object [] {
            matchType,
            metadata
        });
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        // be careful with inheritance
        else if (obj.getClass().equals(this.getClass())) {
            SearchMatch other = (SearchMatch) obj;
            return ((this.matchType == other.matchType) || (this.matchType.equals(other.matchType)))
                && ((this.metadata == other.metadata) || (this.metadata.equals(other.metadata)))
                ;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return Serializer.INSTANCE.serialize(this, false);
    }

    /**
     * Returns a String representation of this object formatted for easier
     * readability.
     *
     * <p> The returned String may contain newlines. </p>
     *
     * @return Formatted, multiline String representation of this object
     */
    public String toStringMultiline() {
        return Serializer.INSTANCE.serialize(this, true);
    }

    /**
     * For internal use only.
     */
    static final class Serializer extends StructSerializer<SearchMatch> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(SearchMatch value, JsonGenerator g, boolean collapse) throws IOException, JsonGenerationException {
            if (!collapse) {
                g.writeStartObject();
            }
            g.writeFieldName("match_type");
            SearchMatchType.Serializer.INSTANCE.serialize(value.matchType, g);
            g.writeFieldName("metadata");
            Metadata.Serializer.INSTANCE.serialize(value.metadata, g);
            if (!collapse) {
                g.writeEndObject();
            }
        }

        @Override
        public SearchMatch deserialize(JsonParser p, boolean collapsed) throws IOException, JsonParseException {
            SearchMatch value;
            String tag = null;
            if (!collapsed) {
                expectStartObject(p);
                tag = readTag(p);
            }
            if (tag == null) {
                SearchMatchType f_matchType = null;
                Metadata f_metadata = null;
                while (p.getCurrentToken() == JsonToken.FIELD_NAME) {
                    String field = p.getCurrentName();
                    p.nextToken();
                    if ("match_type".equals(field)) {
                        f_matchType = SearchMatchType.Serializer.INSTANCE.deserialize(p);
                    }
                    else if ("metadata".equals(field)) {
                        f_metadata = Metadata.Serializer.INSTANCE.deserialize(p);
                    }
                    else {
                        skipValue(p);
                    }
                }
                if (f_matchType == null) {
                    throw new JsonParseException("Required field \"match_type\" missing.", p.getCurrentLocation());
                }
                if (f_metadata == null) {
                    throw new JsonParseException("Required field \"metadata\" missing.", p.getCurrentLocation());
                }
                value = new SearchMatch(f_matchType, f_metadata);
            }
            else {
                throw new JsonParseException("No subtype found that matches tag: \"" + tag + "\"", p.getCurrentLocation());
            }
            if (!collapsed) {
                expectEndObject(p);
            }
            return value;
        }
    }
}
