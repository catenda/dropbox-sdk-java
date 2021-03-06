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

public class UploadWriteFailed {
    // struct UploadWriteFailed

    protected final WriteError reason;
    protected final String uploadSessionId;

    /**
     *
     * @param reason  The reason why the file couldn't be saved. Must not be
     *     {@code null}.
     * @param uploadSessionId  The upload session ID; this may be used to retry
     *     the commit. Must not be {@code null}.
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public UploadWriteFailed(WriteError reason, String uploadSessionId) {
        if (reason == null) {
            throw new IllegalArgumentException("Required value for 'reason' is null");
        }
        this.reason = reason;
        if (uploadSessionId == null) {
            throw new IllegalArgumentException("Required value for 'uploadSessionId' is null");
        }
        this.uploadSessionId = uploadSessionId;
    }

    /**
     * The reason why the file couldn't be saved.
     *
     * @return value for this field, never {@code null}.
     */
    public WriteError getReason() {
        return reason;
    }

    /**
     * The upload session ID; this may be used to retry the commit.
     *
     * @return value for this field, never {@code null}.
     */
    public String getUploadSessionId() {
        return uploadSessionId;
    }

    @Override
    public int hashCode() {
        int hash = java.util.Arrays.hashCode(new Object [] {
            reason,
            uploadSessionId
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
            UploadWriteFailed other = (UploadWriteFailed) obj;
            return ((this.reason == other.reason) || (this.reason.equals(other.reason)))
                && ((this.uploadSessionId == other.uploadSessionId) || (this.uploadSessionId.equals(other.uploadSessionId)))
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
    static final class Serializer extends StructSerializer<UploadWriteFailed> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(UploadWriteFailed value, JsonGenerator g, boolean collapse) throws IOException, JsonGenerationException {
            if (!collapse) {
                g.writeStartObject();
            }
            g.writeFieldName("reason");
            WriteError.Serializer.INSTANCE.serialize(value.reason, g);
            g.writeFieldName("upload_session_id");
            StoneSerializers.string().serialize(value.uploadSessionId, g);
            if (!collapse) {
                g.writeEndObject();
            }
        }

        @Override
        public UploadWriteFailed deserialize(JsonParser p, boolean collapsed) throws IOException, JsonParseException {
            UploadWriteFailed value;
            String tag = null;
            if (!collapsed) {
                expectStartObject(p);
                tag = readTag(p);
            }
            if (tag == null) {
                WriteError f_reason = null;
                String f_uploadSessionId = null;
                while (p.getCurrentToken() == JsonToken.FIELD_NAME) {
                    String field = p.getCurrentName();
                    p.nextToken();
                    if ("reason".equals(field)) {
                        f_reason = WriteError.Serializer.INSTANCE.deserialize(p);
                    }
                    else if ("upload_session_id".equals(field)) {
                        f_uploadSessionId = StoneSerializers.string().deserialize(p);
                    }
                    else {
                        skipValue(p);
                    }
                }
                if (f_reason == null) {
                    throw new JsonParseException("Required field \"reason\" missing.", p.getCurrentLocation());
                }
                if (f_uploadSessionId == null) {
                    throw new JsonParseException("Required field \"upload_session_id\" missing.", p.getCurrentLocation());
                }
                value = new UploadWriteFailed(f_reason, f_uploadSessionId);
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
