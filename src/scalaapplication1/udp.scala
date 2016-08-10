
import java.net.DatagramPacket
import java.net.DatagramSocket


class TCPSocket(
host :String, port:Int
  ) {
//      sock :DatagramSocket
  	//buf :Array[Byte]
    val bufsize = 16
    val sock  = new DatagramSocket(port)
    val buf = new Array[Byte](bufsize)
    val packet = new DatagramPacket(buf, bufsize)

    
// //    while (true) {
// //      sock.receive(packet)
// //      println("received packet from: " + packet.getAddress())
// //      sock.send(packet)
// //      println("echoed data (first 16 bytess): " + packet.getData().take(16).toString())
// //    }
// 	this
//   }


  def send(data :String){
    println(data)

  }

}

