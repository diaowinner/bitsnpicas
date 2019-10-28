package com.kreative.bitsnpicas.geos;

import java.io.ByteArrayOutputStream;

public class PETSCII {
	public static final int[] PRIMARY_G0 = new int[] {
		0x0020, 0x0021, 0x0022, 0x0023, 0x0024, 0x0025, 0x0026, 0x0027,
		0x0028, 0x0029, 0x002A, 0x002B, 0x002C, 0x002D, 0x002E, 0x002F,
		0x0030, 0x0031, 0x0032, 0x0033, 0x0034, 0x0035, 0x0036, 0x0037,
		0x0038, 0x0039, 0x003A, 0x003B, 0x003C, 0x003D, 0x003E, 0x003F,
		0x0040, 0x0041, 0x0042, 0x0043, 0x0044, 0x0045, 0x0046, 0x0047,
		0x0048, 0x0049, 0x004A, 0x004B, 0x004C, 0x004D, 0x004E, 0x004F,
		0x0050, 0x0051, 0x0052, 0x0053, 0x0054, 0x0055, 0x0056, 0x0057,
		0x0058, 0x0059, 0x005A, 0x005B, 0x00A3, 0x005D, 0x2191, 0x2190,
		0x2500, 0x2660, 0x1FB72, 0x1FB78, 0x1FB77, 0x1FB76, 0x1FB7A, 0x1FB71,
		0x1FB74, 0x256E, 0x2570, 0x256F, 0x1FB7C, 0x2572, 0x2571, 0x1FB7D,
		0x1FB7E, 0x2022, 0x1FB7B, 0x2665, 0x1FB70, 0x256D, 0x2573, 0x25CB,
		0x2663, 0x1FB75, 0x2666, 0x253C, 0x1FB8C, 0x2502, 0x03C0, 0x25E5,
	};
	
	public static final int[] PRIMARY_G1 = new int[] {
		0x00A0, 0x258C, 0x2584, 0x2594, 0x2581, 0x258F, 0x2592, 0x2595,
		0x1FB8F, 0x25E4, 0x1FB87, 0x251C, 0x2597, 0x2514, 0x2510, 0x2582,
		0x250C, 0x2534, 0x252C, 0x2524, 0x258E, 0x258D, 0x1FB88, 0x1FB82,
		0x1FB83, 0x2583, 0x1FB7F, 0x2596, 0x259D, 0x2518, 0x2598, 0x259A,
		0x2500, 0x2660, 0x1FB72, 0x1FB78, 0x1FB77, 0x1FB76, 0x1FB7A, 0x1FB71,
		0x1FB74, 0x256E, 0x2570, 0x256F, 0x1FB7C, 0x2572, 0x2571, 0x1FB7D,
		0x1FB7E, 0x2022, 0x1FB7B, 0x2665, 0x1FB70, 0x256D, 0x2573, 0x25CB,
		0x2663, 0x1FB75, 0x2666, 0x253C, 0x1FB8C, 0x2502, 0x03C0, 0x25E5,
		0x00A0, 0x258C, 0x2584, 0x2594, 0x2581, 0x258F, 0x2592, 0x2595,
		0x1FB8F, 0x25E4, 0x1FB87, 0x251C, 0x2597, 0x2514, 0x2510, 0x2582,
		0x250C, 0x2534, 0x252C, 0x2524, 0x258E, 0x258D, 0x1FB88, 0x1FB82,
		0x1FB83, 0x2583, 0x1FB7F, 0x2596, 0x259D, 0x2518, 0x2598, 0x259A,
	};
	
	public static final int[] ALTERNATE_G0 = new int[] {
		0x0020, 0x0021, 0x0022, 0x0023, 0x0024, 0x0025, 0x0026, 0x0027,
		0x0028, 0x0029, 0x002A, 0x002B, 0x002C, 0x002D, 0x002E, 0x002F,
		0x0030, 0x0031, 0x0032, 0x0033, 0x0034, 0x0035, 0x0036, 0x0037,
		0x0038, 0x0039, 0x003A, 0x003B, 0x003C, 0x003D, 0x003E, 0x003F,
		0x0040, 0x0061, 0x0062, 0x0063, 0x0064, 0x0065, 0x0066, 0x0067,
		0x0068, 0x0069, 0x006A, 0x006B, 0x006C, 0x006D, 0x006E, 0x006F,
		0x0070, 0x0071, 0x0072, 0x0073, 0x0074, 0x0075, 0x0076, 0x0077,
		0x0078, 0x0079, 0x007A, 0x005B, 0x00A3, 0x005D, 0x2191, 0x2190,
		0x2500, 0x0041, 0x0042, 0x0043, 0x0044, 0x0045, 0x0046, 0x0047,
		0x0048, 0x0049, 0x004A, 0x004B, 0x004C, 0x004D, 0x004E, 0x004F,
		0x0050, 0x0051, 0x0052, 0x0053, 0x0054, 0x0055, 0x0056, 0x0057,
		0x0058, 0x0059, 0x005A, 0x253C, 0x1FB8C, 0x2502, 0x1FB96, 0x1FB98,
	};
	
	public static final int[] ALTERNATE_G1 = new int[] {
		0x00A0, 0x258C, 0x2584, 0x2594, 0x2581, 0x258F, 0x2592, 0x2595,
		0x1FB8F, 0x1FB99, 0x1FB87, 0x251C, 0x2597, 0x2514, 0x2510, 0x2582,
		0x250C, 0x2534, 0x252C, 0x2524, 0x258E, 0x258D, 0x1FB88, 0x1FB82,
		0x1FB83, 0x2583, 0x2713, 0x2596, 0x259D, 0x2518, 0x2598, 0x259A,
		0x2500, 0x0041, 0x0042, 0x0043, 0x0044, 0x0045, 0x0046, 0x0047,
		0x0048, 0x0049, 0x004A, 0x004B, 0x004C, 0x004D, 0x004E, 0x004F,
		0x0050, 0x0051, 0x0052, 0x0053, 0x0054, 0x0055, 0x0056, 0x0057,
		0x0058, 0x0059, 0x005A, 0x253C, 0x1FB8C, 0x2502, 0x1FB96, 0x1FB98,
		0x00A0, 0x258C, 0x2584, 0x2594, 0x2581, 0x258F, 0x2592, 0x2595,
		0x1FB8F, 0x1FB99, 0x1FB87, 0x251C, 0x2597, 0x2514, 0x2510, 0x2582,
		0x250C, 0x2534, 0x252C, 0x2524, 0x258E, 0x258D, 0x1FB88, 0x1FB82,
		0x1FB83, 0x2583, 0x2713, 0x2596, 0x259D, 0x2518, 0x2598, 0x259A,
	};
	
	public static int toUnicode(int cp, boolean alt) {
		cp &= 0xFF;
		if (cp >= 0x20 && cp <= 0x7F) return (alt ? ALTERNATE_G0 : PRIMARY_G0)[cp - 0x20];
		if (cp >= 0xA0 && cp <= 0xFF) return (alt ? ALTERNATE_G1 : PRIMARY_G1)[cp - 0xA0];
		return cp;
	}
	
	public static int fromUnicode(int cp, boolean alt) {
		if (cp >= 0x00 && cp <= 0x1F) return cp;
		if (cp >= 0x80 && cp <= 0x9F) return cp;
		for (int i = 0; i < 96; i++) {
			if ((alt ? ALTERNATE_G0 : PRIMARY_G0)[i] == cp) {
				return i + 0x20;
			}
		}
		for (int i = 0; i < 96; i++) {
			if ((alt ? ALTERNATE_G1 : PRIMARY_G1)[i] == cp) {
				return i + 0xA0;
			}
		}
		return 0x3F;
	}
	
	public static String toString(byte[] b, boolean alt) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < b.length; i++) {
			int cp = toUnicode(b[i], alt);
			sb.append(Character.toChars(cp));
		}
		return sb.toString();
	}
	
	public static byte[] fromString(String s, boolean alt) {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		int i = 0;
		while (i < s.length()) {
			int cp = s.codePointAt(i);
			out.write(fromUnicode(cp, alt));
			i += Character.charCount(cp);
		}
		return out.toByteArray();
	}
}
