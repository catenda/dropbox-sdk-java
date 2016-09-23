/* DO NOT EDIT */
/* This file was generated from async.stone */

package com.dropbox.core.v2.async;

import com.dropbox.core.stone.StoneSerializers;
import com.dropbox.core.stone.StructSerializer;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import java.io.IOException;

/**
 * Arguments for methods that poll the status of an asynchronous job.
 */
public class PollArg {
    // struct PollArg

    protected final String asyncJobId;

    /**
     * Arguments for methods that poll the status of an asynchronous job.
     *
     * @param asyncJobId  Id of the asynchronous job. This is the value of a
     *     response returned from the method that launched the job. Must have
     *     length of at least 1 and not be {@code null}.
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public PollArg(String asyncJobId) {
        if (asyncJobId == null) {
            throw new IllegalArgumentException("Required value for 'asyncJobId' is null");
        }
        if (asyncJobId.length() < 1) {
            throw new IllegalArgumentException("String 'asyncJobId' is shorter than 1");
        }
        this.asyncJobId = asyncJobId;
    }

    /**
     * Id of the asynchronous job. This is the value of a response returned from
     * the method that launched the job.
     *
     * @return value for this field, never {@code null}.
     */
    public String getAsyncJobId() {
        return asyncJobId;
    }

    @Override
    public int hashCode() {
        int hash = java.util.Arrays.hashCode(new Object [] {
            asyncJobId
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
            PollArg other = (PollArg) obj;
            return (this.asyncJobId == other.asyncJobId) || (this.asyncJobId.equals(other.asyncJobId));
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
    public static final class Serializer extends StructSerializer<PollArg> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(PollArg value, JsonGenerator g, boolean collapse) throws IOException, JsonGenerationException {
            if (!collapse) {
                g.writeStartObject();
            }
            g.writeFieldName("async_job_id");
            StoneSerializers.string().serialize(value.asyncJobId, g);
            if (!collapse) {
                g.writeEndObject();
            }
        }

        @Override
        public PollArg deserialize(JsonParser p, boolean collapsed) throws IOException, JsonParseException {
            PollArg value;
            String tag = null;
            if (!collapsed) {
                expectStartObject(p);
                tag = readTag(p);
            }
            if (tag == null) {
                String f_asyncJobId = null;
                while (p.getCurrentToken() == JsonToken.FIELD_NAME) {
                    String field = p.getCurrentName();
                    p.nextToken();
                    if ("async_job_id".equals(field)) {
                        f_asyncJobId = StoneSerializers.string().deserialize(p);
                    }
                    else {
                        skipValue(p);
                    }
                }
                if (f_asyncJobId == null) {
                    throw new JsonParseException("Required field \"async_job_id\" missing.", p.getCurrentLocation());
                }
                value = new PollArg(f_asyncJobId);
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
