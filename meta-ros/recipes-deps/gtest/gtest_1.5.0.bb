DESCRIPTION = "Google C++ Testing Framework"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING;md5=cbbd27594afd089daa160d3a16dd515a"

DEPENDS = ""
SRCNAME = "gtest"
PR = "r0"
PV = "1.5.0"


SRC_URI = "http://googletest.googlecode.com/files/gtest-1.5.0.tar.bz2;name=gtest"
SRC_URI[gtest.md5sum] = "8b2c3c3f26cb53e64a3109d03a97200a"
SRC_URI[gtest.sha256sum] = "1bf9ee2e49037f908796980ac7df7ac45393563e1e721ce68879a81f4013f9c0"


S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit autotools

