package it.italiaonline.rnd.compression

interface CompressionEngine {
	String compress(String input)
	String uncompress(String compressedInput)
}
