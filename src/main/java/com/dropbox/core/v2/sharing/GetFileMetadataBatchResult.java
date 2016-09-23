/* DO NOT EDIT */
/* This file was generated from sharing_files.stone */

package com.dropbox.core.v2.sharing;

import com.dropbox.core.stone.StoneSerializers;
import com.dropbox.core.stone.StructSerializer;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import java.io.IOException;

/**
 * Per file results of {@link
 * DbxUserSharingRequests#getFileMetadataBatch(java.util.List)}
 */
public class GetFileMetadataBatchResult {
    // struct GetFileMetadataBatchResult

    protected final String file;
    protected final GetFileMetadataIndividualResult result;

    /**
     * Per file results of {@link
     * DbxUserSharingRequests#getFileMetadataBatch(java.util.List)}
     *
     * @param file  This is the input file identifier corresponding to one of
     *     the {@code files} argument to {@link
     *     DbxUserSharingRequests#getFileMetadataBatch(java.util.List)}. Must
     *     have length of at least 1, match pattern "{@code
     *     ((/|id:).*|nspath:[^:]*:[^:]*)}", and not be {@code null}.
     * @param result  The result for this particular file. Must not be {@code
     *     null}.
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public GetFileMetadataBatchResult(String file, GetFileMetadataIndividualResult result) {
        if (file == null) {
            throw new IllegalArgumentException("Required value for 'file' is null");
        }
        if (file.length() < 1) {
            throw new IllegalArgumentException("String 'file' is shorter than 1");
        }
        if (!java.util.regex.Pattern.matches("((/|id:).*|nspath:[^:]*:[^:]*)", file)) {
            throw new IllegalArgumentException("String 'file' does not match pattern");
        }
        this.file = file;
        if (result == null) {
            throw new IllegalArgumentException("Required value for 'result' is null");
        }
        this.result = result;
    }

    /**
     * This is the input file identifier corresponding to one of the {@code
     * files} argument to {@link
     * DbxUserSharingRequests#getFileMetadataBatch(java.util.List)}.
     *
     * @return value for this field, never {@code null}.
     */
    public String getFile() {
        return file;
    }

    /**
     * The result for this particular file
     *
     * @return value for this field, never {@code null}.
     */
    public GetFileMetadataIndividualResult getResult() {
        return result;
    }

    @Override
    public int hashCode() {
        int hash = java.util.Arrays.hashCode(new Object [] {
            file,
            result
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
            GetFileMetadataBatchResult other = (GetFileMetadataBatchResult) obj;
            return ((this.file == other.file) || (this.file.equals(other.file)))
                && ((this.result == other.result) || (this.result.equals(other.result)))
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
    static final class Serializer extends StructSerializer<GetFileMetadataBatchResult> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(GetFileMetadataBatchResult value, JsonGenerator g, boolean collapse) throws IOException, JsonGenerationException {
            if (!collapse) {
                g.writeStartObject();
            }
            g.writeFieldName("file");
            StoneSerializers.string().serialize(value.file, g);
            g.writeFieldName("result");
            GetFileMetadataIndividualResult.Serializer.INSTANCE.serialize(value.result, g);
            if (!collapse) {
                g.writeEndObject();
            }
        }

        @Override
        public GetFileMetadataBatchResult deserialize(JsonParser p, boolean collapsed) throws IOException, JsonParseException {
            GetFileMetadataBatchResult value;
            String tag = null;
            if (!collapsed) {
                expectStartObject(p);
                tag = readTag(p);
            }
            if (tag == null) {
                String f_file = null;
                GetFileMetadataIndividualResult f_result = null;
                while (p.getCurrentToken() == JsonToken.FIELD_NAME) {
                    String field = p.getCurrentName();
                    p.nextToken();
                    if ("file".equals(field)) {
                        f_file = StoneSerializers.string().deserialize(p);
                    }
                    else if ("result".equals(field)) {
                        f_result = GetFileMetadataIndividualResult.Serializer.INSTANCE.deserialize(p);
                    }
                    else {
                        skipValue(p);
                    }
                }
                if (f_file == null) {
                    throw new JsonParseException("Required field \"file\" missing.", p.getCurrentLocation());
                }
                if (f_result == null) {
                    throw new JsonParseException("Required field \"result\" missing.", p.getCurrentLocation());
                }
                value = new GetFileMetadataBatchResult(f_file, f_result);
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
