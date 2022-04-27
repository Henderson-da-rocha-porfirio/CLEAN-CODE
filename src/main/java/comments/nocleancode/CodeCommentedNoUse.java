package src.main.java.comments.nocleancode;

/*Why are those two lines of code commented?
        Are they important? Were they left as reminders for some imminent change?
        Or are they just cruft that someone commented-out years ago and has simply not bothered to clean up:*/
public class CodeCommentedNoUse {

    ...

    this.bytePos = writeBytes(pngIdBytes, 0);

    // hdrPos = bytePos;
    writeHeader();
    writeResolution();
    // dataPos = bytePos;
    if(writeImageData()) {
        writeEnd();
        this.pngBytes = resizeByteArray(this.pngBytes, this.maxPos);
    }
    else{
        this.pngBytes = null;
    }
    return this.pngBytes;
}
