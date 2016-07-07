package com.example.android.cardemulation;

/* ********************************************************************
 *  (C) COPYRIGHT INTERNATIONAL BUSINESS MACHINES CORPORATION 2004.   *
 *                       ALL RIGHTS RESERVED                          *
 *        IBM Research Division, Zurich Research Laboratory           *
 * ------------------------------------------------------------------ *
 * Java and all Java-based trademarks and logos are trademarks or     *
 * registered trademarks of Sun Microsystems, Inc. in the United      *
 * States and other countries.                                        *
 **********************************************************************/
/**
 * <code>ISO7816</code> encapsulates constants related to ISO 7816-3 and ISO
 * 7816-4. <code>ISO7816</code> interface contains only static fields.
 * <p>
 * The static fields with <code>SW_</code> prefixes define constants for the ISO
 * 7816-4 defined response status word. The fields which use the
 * <code>_00</code> suffix require the low order byte to be customized
 * appropriately e.g (ISO7816.SW_CORRECT_LENGTH_00 + (0x0025 &amp; 0xFF)).
 * <p>
 * The static fields with <code>OFFSET_</code> prefixes define constants to be
 * used to index into the APDU buffer byte array to access ISO 7816-4 defined
 * header information.
 */
public interface ISO7816 {

	/**
	 * Response status : Incorrect parameters (P1,P2) = 0x6A86
	 */
	public static final short SW_INCORRECT_P1P2 = (short) 0x6a86;

	/**
	 * Response status : Not enough memory space in the file = 0x6A84
	 */
	public static final short SW_FILE_FULL = (short) 0x6a84;

	/**
	 * Response status : Card does not support secure messaging = 0x6882
	 */
	public static final short SW_SECURE_MESSAGING_NOT_SUPPORTED = (short) 0x6882;

	/**
	 * Response status : Command not allowed (no current EF) = 0x6986
	 */
	public static final short SW_COMMAND_NOT_ALLOWED = (short) 0x6986;

	/**
	 * APDU command INS : SELECT = 0xA4
	 */
	public static final byte INS_SELECT = (byte) 0xffa4;

	/**
	 * APDU command INS : EXTERNAL AUTHENTICATE = 0x82
	 */
	public static final byte INS_EXTERNAL_AUTHENTICATE = (byte) 0xff82;

	/**
	 * Response status : Security condition not satisfied = 0x6982
	 */
	public static final short SW_SECURITY_STATUS_NOT_SATISFIED = (short) 0x6982;

	/**
	 * Response status : File invalid = 0x6983
	 */
	public static final short SW_FILE_INVALID = (short) 0x6983;

	/**
	 * Response status : CLA value not supported = 0x6E00
	 */
	public static final short SW_CLA_NOT_SUPPORTED = (short) 0x6e00;

	/**
	 * Response status : Warning, card state unchanged = 0x6200
	 */
	public static final short SW_WARNING_STATE_UNCHANGED = (short) 0x6200;

	/**
	 * Response status : Applet selection failed = 0x6999;
	 */
	public static final short SW_APPLET_SELECT_FAILED = (short) 0x6999;

	/**
	 * Response status : Function not supported = 0x6A81
	 */
	public static final short SW_FUNC_NOT_SUPPORTED = (short) 0x6a81;

	/**
	 * Response status : Incorrect parameters (P1,P2) = 0x6B00
	 */
	public static final short SW_WRONG_P1P2 = (short) 0x6b00;

	/**
	 * APDU header offset : INS = 1
	 */
	public static final byte OFFSET_INS = (byte) 0x0001;

	/**
	 * Response status : Record not found = 0x6A83
	 */
	public static final short SW_RECORD_NOT_FOUND = (short) 0x6a83;

	/**
	 * APDU header offset : CLA = 0
	 */
	public static final byte OFFSET_CLA = (byte) 0x0000;

	/**
	 * APDU command data offset : CDATA = 5
	 */
	public static final byte OFFSET_CDATA = (byte) 0x0005;

	/**
	 * Response status : File not found = 0x6A82
	 */
	public static final short SW_FILE_NOT_FOUND = (short) 0x6a82;

	/**
	 * Response status : Data invalid = 0x6984
	 */
	public static final short SW_DATA_INVALID = (short) 0x6984;

	/**
	 * Response status : No precise diagnosis = 0x6F00
	 */
	public static final short SW_UNKNOWN = (short) 0x6f00;

	/**
	 * Response status : Card does not support logical channels = 0x6881
	 */
	public static final short SW_LOGICAL_CHANNEL_NOT_SUPPORTED = (short) 0x6881;

	/**
	 * Response status : No Error = (short)0x9000
	 */
	public static final short SW_NO_ERROR = (short) 0x9000;

	/**
	 * Response status : Conditions of use not satisfied = 0x6985
	 */
	public static final short SW_CONDITIONS_NOT_SATISFIED = (short) 0x6985;

	/**
	 * APDU header offset : P1 = 2
	 */
	public static final byte OFFSET_P1 = (byte) 0x0002;

	/**
	 * APDU command CLA : ISO 7816 = 0x00
	 */
	public static final byte CLA_ISO7816 = (byte) 0x0000;

	/**
	 * APDU header offset : LC = 4
	 */
	public static final byte OFFSET_LC = (byte) 0x0004;

	/**
	 * Response status : INS value not supported = 0x6D00
	 */
	public static final short SW_INS_NOT_SUPPORTED = (short) 0x6d00;

	/**
	 * Response status : Wrong length = 0x6700
	 */
	public static final short SW_WRONG_LENGTH = (short) 0x6700;

	/**
	 * APDU header offset : P2 = 3
	 */
	public static final byte OFFSET_P2 = (byte) 0x0003;

	/**
	 * Response status : Correct Expected Length (Le) = 0x6C00
	 */
	public static final short SW_CORRECT_LENGTH_00 = (short) 0x6c00;

	/**
	 * Response status : Wrong data = 0x6A80
	 */
	public static final short SW_WRONG_DATA = (short) 0x6a80;

	/**
	 * Response status : Response bytes remaining = 0x6100
	 */
	public static final short SW_BYTES_REMAINING_00 = (short) 0x6100;

}
