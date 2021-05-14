package com.xilinx.rapidwright.interchange;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import com.xilinx.rapidwright.device.Node;
import com.xilinx.rapidwright.device.Tile;
import com.xilinx.rapidwright.device.Wire;
import com.xilinx.rapidwright.interchange.Enumerator;

public class NodeShape {
    // Fast storage of node patterns
    short[] dx, dy;
    int[] name;
    // MD5 key, for fast comparisons
    String key;
    public NodeShape(Node n, Enumerator<String> allStrings) {
        Tile root = n.getTile();
        Wire[] wires = n.getAllWiresInNode();
        dx = new short[wires.length];
        dy = new short[wires.length];
        name = new int[wires.length];
        for (int i = 0; i < wires.length; i++) {
            Wire w = wires[i];
            dx[i] = (short)(w.getTile().getColumn() - root.getColumn());
            dy[i] = (short)(w.getTile().getRow() - root.getRow());
            name[i] = allStrings.getIndex(w.getWireName());
        }
        // Compute a MD5 key for fast enumeration
        try {
            MessageDigest md = MessageDigest.getInstance("md5");
            byte[] tempbuf = {0, 0, 0, 0};
            byte[] tempbuf_s = {0, 0};
            java.util.function.Consumer<Integer> add_int = (Integer x) -> {
                tempbuf[0] = (byte)(x >> 24);
                tempbuf[1] = (byte)(x >> 16);
                tempbuf[2] = (byte)(x >> 8);
                tempbuf[3] = (byte)(x >> 0);
                md.update(tempbuf);
            };
            java.util.function.Consumer<Short> add_short = (Short x) -> {
                tempbuf_s[0] = (byte)(x >> 8);
                tempbuf_s[1] = (byte)(x >> 0);
                md.update(tempbuf_s);
            };
            add_int.accept(dx.length);
            for (int i = 0; i < dx.length; i++) {
                add_short.accept(dx[i]);
                add_short.accept(dy[i]);
                add_int.accept(name[i]);
            }
            key = Base64.getEncoder().encodeToString(md.digest());
        } catch (NoSuchAlgorithmException e) {
            assert false; // should never happen, MD5 should always exist
        }
    }

    public String toString(){
        return key;
    }

};
