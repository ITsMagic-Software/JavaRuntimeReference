package JAVARuntime;

//<REMOVE-BRIDGE>
//
import com.itsmagic.engine.Engines.Sound.Adapters.FileSoundEmitter;
import com.itsmagic.engine.Engines.Sound.Decoder.RawDataDecoder;
import com.itsmagic.engine.Engines.Sound.Native.NativeSoundEmitter;
//>REMOVE-BRIDGE<

import java.io.File;

public final class SoundDecoder {

    @UnimplementedDoc
    @MethodArgs(args ={"file"})
    public static SoundData decodeFile(File soundFile) throws Exception {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        RawDataDecoder.Outdata data = RawDataDecoder.decode(soundFile);
        if(data == null) throw new RuntimeException("Failed to load file");

        SoundData o = new SoundData();
        o.setDataBuffer(data.getLeft().toJAVARuntime());
        o.setSampleRate(data.getSampleRate());
        return o;
        //>REMOVE-BRIDGE<
    }

    @UnimplementedDoc
    @MethodArgs(args ={"file"})
    public static SoundEmitter streamDecodeFile(File soundFile) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        NativeSoundEmitter nativeSoundEmitter = new FileSoundEmitter(soundFile, FileSoundEmitter.Mode.STREAM);
        SoundEmitter soundEmitter = new SoundEmitter(nativeSoundEmitter);
        return soundEmitter;
        //>REMOVE-BRIDGE<
    }
}
