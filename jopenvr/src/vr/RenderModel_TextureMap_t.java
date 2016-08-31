package vr;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>
 *
 * A texture map for use on a render model.
 */
public class RenderModel_TextureMap_t extends Structure {

    // width and height of the texture map in pixels
    public short unWidth, unHeight;
    /**
     * const uint8_t *<br>
     * C type : uint8_t*
     *
     * Map texture data. All textures are RGBA with 8 bits per channel per pixel. Data size is width * height * 4ub.
     */
    public Pointer rubTextureMapData;
    
    public int dataSize() {
        return unWidth * unHeight * 4 * Byte.BYTES;
    }

    public RenderModel_TextureMap_t() {
        super();
    }

    @Override
    protected List<?> getFieldOrder() {
        return Arrays.asList("unWidth", "unHeight", "rubTextureMapData");
    }

    /**
     * @param unWidth
     * @param unHeight
     * @param rubTextureMapData const uint8_t *<br>
     * C type : uint8_t*
     */
    public RenderModel_TextureMap_t(short unWidth, short unHeight, Pointer rubTextureMapData) {
        super();
        this.unWidth = unWidth;
        this.unHeight = unHeight;
        this.rubTextureMapData = rubTextureMapData;
    }

    public RenderModel_TextureMap_t(Pointer peer) {
        super(peer);
    }

    public static class ByReference extends RenderModel_TextureMap_t implements Structure.ByReference {
    };

    public static class ByValue extends RenderModel_TextureMap_t implements Structure.ByValue {
    };
}
