package cn.bdqn.as.util;

import java.security.MessageDigest;

/***
 * 
 * @author Sam <br />
 *         鍔犲瘑宸ュ叿绫�
 *
 */
public class MD5Encrypter {

	private static final char[] HEX_DIGITS = { '0', '1', '2', '3', '4', '5',
			'6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

	/***
	 * 浣跨敤MD5杩涜鍔犲瘑
	 * 
	 * @param text
	 *            , 闇�瑕佸姞瀵嗙殑鏂囧瓧
	 * @return, md5瀵嗘枃
	 */
	public static String encrypt(String text) {
		byte[] input = text.getBytes();
		return encrypt(input);
	}

	/***
	 * 浣跨敤MD5杩涜鍔犲瘑
	 * 
	 * @param input
	 *            ,闇�瑕佸姞瀵嗙殑byte鏁扮粍
	 * @return,md5瀵嗘枃
	 */
	public static String encrypt(byte[] input) {
		try {
			// 鑾峰緱MD5鎽樿绠楁硶鐨� MessageDigest瀵硅薄
			MessageDigest mdInst = MessageDigest.getInstance("MD5");
			// 浣跨敤鎸囧畾鐨勫瓧鑺傛洿鏂版憳瑕�
			mdInst.update(input);
			// 鑾峰緱瀵嗘枃
			byte[] md = mdInst.digest();
			// 鎶婂瘑鏂囪浆鎹㈡垚鍗佸叚杩涘埗鐨勫瓧绗︿覆褰㈠紡
			int j = md.length;
			char str[] = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; i++) {
				byte byte0 = md[i];
				str[k++] = HEX_DIGITS[byte0 >>> 4 & 0xf];
				str[k++] = HEX_DIGITS[byte0 & 0xf];
			}
			return new String(str);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
