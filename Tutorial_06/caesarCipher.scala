import scala.io.StdIn._

object caesarCipher extends App {

  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  val encrypt = (character:Char, shift:Int, alphabet:String) => alphabet((alphabet.indexOf(character.toUpper) + shift)%alphabet.size)
  val decrypt = (character:Char, shift:Int, alphabet:String) => alphabet((alphabet.indexOf(character.toUpper) - shift + alphabet.size)%alphabet.size)

  val cipher = (func:(Char, Int, String) => Char, message:String, shift:Int, alphabet:String) => message.map(func(_, shift, alphabet))

  val msg =readLine("Message to be encrypted: ")
  print("The message should get shifted by : ")
  val num = readInt ()

  val encryptedMsg = cipher(encrypt, msg, num, alphabet)
  val decryptedMsg = cipher(decrypt, encryptedMsg, num, alphabet)

  println("Encrypted message : " + encryptedMsg)
  println("Decrypted message : "+ decryptedMsg)

}