DESCRIPTION = "libraw1394 provides direct access to the IEEE 1394 bus through the Linux 1394 subsystem's raw1394 user space interface"
SECTION = "libs"
DEPENDS = ""
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=d8045f3b8f929c1cb29a1e3fd737b499"
HOMEPAGE = "http://www.dennedy.org/libraw1394/"

PR = "r0"

SRC_URI = "${SOURCEFORGE_MIRROR}/libraw1394/libraw1394-${PV}.tar.gz"

#build this:
S = "${WORKDIR}/${P}"

inherit autotools pkgconfig

SRC_URI[md5sum] = "1db64231c78540c32859b591cb8b40cf"
SRC_URI[sha256sum] = "50e7b812f09ec8181fc060e7e25e260017c16c1b41a04c51e23446f26fa109d4"
