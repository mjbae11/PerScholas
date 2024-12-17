package buffer;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
public class ChannelDemoTwo {
    public static void main(String args[]) throws IOException {
        // initializing a string of file path
        String fname = "C:/Downloads/testingFile.txt";
        // Making a new file input stream for byte reading
        FileInputStream file = new FileInputStream(fname);
        // making a new channel for entry and reading / writing data
        FileChannel fileChannel = file.getChannel();
        // analyze the size of the channel
        long filesize =  fileChannel.size();
        // intializing buffer, with an allocated size of the filesize
        // ByteBuffer buffersize  =  ByteBuffer.allocate(200);
        ByteBuffer byteBuffer  =  ByteBuffer.allocate( (int) filesize);
        // read date from a channel to a buffer
        while (fileChannel.read(byteBuffer) > 0) {
            // flip the buffer to prepare for get operation
            byteBuffer.flip();
            while (byteBuffer.hasRemaining()) {
                //get() method used to read data from buffer and
                // read 1 byte at a time from buffer
                System.out.print((char) byteBuffer.get());
            }
        }
        file.close();
        fileChannel.close();
    }
}

