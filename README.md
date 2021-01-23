FTP     21
TELNET  23
SMTP    25
DNS     53
HTTP    80
POP3    110
SOCK    1080


Layer 7 application (HTTP, FTP ,etc.)
Layer 6 Presentation
layer 5 Session
layer 4 transport  (TCP or UDP) + port number <Transport header>
layer 3 network/Internet  <IP header source/destination IP>
layer 2 data link/network interace <Ethernet Header/trailer>
layer 1 physical

TCP (Transmition Control protocol)
(Send in segemnts)
1)tracking transmitted data segments
2)Acknowledging recieved data
3)Retransmitting any unacknowleged data

UDP (User Datagram Protocol)
packet may lost or delivered out of order
Message split into datagrams, user sends datagrams as packets on network layer
unreliable but fast
application must deal with lost packets


IP
connectionless: No Connection with the destination established before sending data packets
Best Effort (unreliable) Packet delivery is not guaranteed
Media Independent:  Operation is independent of the medium carrying the data

Loopback interface
127.0.0.1/32 --localhost/loopback

32 bits (IPv4)  i.e 10.144.23.98

AMERICAN REGISTRY OF INTERNET NUMBERS (ARIN) 
RESEAUX IP EUROPE (RIPE)
ASIA PACIFIC NETWORK INFORMATION CENTER (APNIC)
-CENTRAL AUTHORITY

DNS
DOMAIN NAME SYSTEM