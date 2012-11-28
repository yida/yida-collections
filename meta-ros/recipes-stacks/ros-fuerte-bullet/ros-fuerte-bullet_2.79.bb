DESCRIPTION = "This package contains version 2.79 of the Bullet professional free 3D Game Multiphysics Library."
HOMEPAGE = "http://ros.org/wiki/bullet"
LICENSE = "BSD LGPL"
LIC_FILES_CHKSUM = "file://../../BSD-Willow.txt;md5=51a25bf2b127f8eb390aa2c2d5ca028d"
DEPENDS = "ros-fuerte-gumstix ros-fuerte-gumstix-native"

SRCREV = ""
PR = "r0"
SETNAME = ""
SRCNAME="bullet"

inherit stacks 

SRC_URI = "https://code.ros.org/svn/release/download/stacks/bullet/bullet-2.79/bullet-${PV}.tar.bz2 \
           file://BSD-Willow.txt"
SRC_URI[md5sum] = "a9257da0e0d0426e7e04d11ca8366b0f"
SRC_URI[sha256sum] = "b303e09909ed1c82002ded1f70fe255ddabda34b054fc2179f8818d5fe2772af"

cmake_do_configure_prepend() {
  cp -rf ${WORKDIR}/${SRCNAME}-${PV}/* ${WORKDIR}/source/${SETNAME}/${SRCNAME}/.
}
