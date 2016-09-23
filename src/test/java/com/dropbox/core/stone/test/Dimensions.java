/* DO NOT EDIT */
/* This file was generated from test.stone */

package com.dropbox.core.stone.test;

import com.dropbox.core.stone.StoneSerializers;
import com.dropbox.core.stone.StructSerializer;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import java.io.IOException;

public class Dimensions {
    // struct Dimensions

    protected final long width;
    protected final long height;

    public Dimensions(long width, long height) {
        this.width = width;
        this.height = height;
    }

    /**
     *
     * @return value for this field.
     */
    public long getWidth() {
        return width;
    }

    /**
     *
     * @return value for this field.
     */
    public long getHeight() {
        return height;
    }

    @Override
    public int hashCode() {
        int hash = java.util.Arrays.hashCode(new Object [] {
            width,
            height
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
            Dimensions other = (Dimensions) obj;
            return (this.width == other.width)
                && (this.height == other.height)
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
    static final class Serializer extends StructSerializer<Dimensions> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(Dimensions value, JsonGenerator g, boolean collapse) throws IOException, JsonGenerationException {
            if (!collapse) {
                g.writeStartObject();
            }
            g.writeFieldName("width");
            StoneSerializers.uInt32().serialize(value.width, g);
            g.writeFieldName("height");
            StoneSerializers.uInt32().serialize(value.height, g);
            if (!collapse) {
                g.writeEndObject();
            }
        }

        @Override
        public Dimensions deserialize(JsonParser p, boolean collapsed) throws IOException, JsonParseException {
            Dimensions value;
            String tag = null;
            if (!collapsed) {
                expectStartObject(p);
                tag = readTag(p);
            }
            if (tag == null) {
                Long f_width = null;
                Long f_height = null;
                while (p.getCurrentToken() == JsonToken.FIELD_NAME) {
                    String field = p.getCurrentName();
                    p.nextToken();
                    if ("width".equals(field)) {
                        f_width = StoneSerializers.uInt32().deserialize(p);
                    }
                    else if ("height".equals(field)) {
                        f_height = StoneSerializers.uInt32().deserialize(p);
                    }
                    else {
                        skipValue(p);
                    }
                }
                if (f_width == null) {
                    throw new JsonParseException("Required field \"width\" missing.", p.getCurrentLocation());
                }
                if (f_height == null) {
                    throw new JsonParseException("Required field \"height\" missing.", p.getCurrentLocation());
                }
                value = new Dimensions(f_width, f_height);
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
