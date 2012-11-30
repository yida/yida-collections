DESCRIPTION = "libdc1394 is a library that provides a complete high level application programming interface (API) for developers who wish to control IEEE 1394 based cameras that conform to the 1394-based Digital Camera Specifications (also known as the IIDC or DCAM Specifications)"
SECTION = "libs"
DEPENDS = "libraw1394"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=dcf3c825659e82539645da41a7908589"
HOMEPAGE = "http://damien.douxchamps.net/ieee1394/libdc1394/"

PR = "r0"

SRC_URI = "git://libdc1394.git.sourceforge.net/gitroot/libdc1394/libdc1394;tag=V_2_2_0;destsuffix=${PN}"

#build this:
S = "${WORKDIR}/${PN}/${PN}"

inherit autotools pkgconfig sdl
