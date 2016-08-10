
import udp.TCPSocket
import java.io._


soc = TCPSocket("localhost", 4000)
soc.send(1:Int)

val writer = new PrintWriter(new File("foto.png" ))

writer.write(soc.read())
writer.close()

