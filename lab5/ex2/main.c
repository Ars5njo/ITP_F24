#include <stdio.h>

struct IPv4 {
    unsigned int totalLength: 16;
    unsigned int ecn: 2;
    unsigned int dscp: 6;
    unsigned int ihl: 4;
    unsigned int version: 4;
};

union packet {
    struct IPv4 ip;
    unsigned int value;
};


int main() {
    union packet Packet;
    printf("Input 32 bits number: ");
    scanf("%u", &Packet.value);
    printf("Version: %u\n", Packet.ip.version);
    printf("IHL: %u\n", Packet.ip.ihl);
    printf("DSCP: %u\n", Packet.ip.dscp);
    printf("ECN: %u\n", Packet.ip.ecn);
    printf("Total Length: %u\n", Packet.ip.totalLength);
    return 0;
}
