DESCRIPTION = "ROS source code (or any source code, really) from multiple version control repositories and updating these checkouts"
HOMEPAGE = "http://www.ros.org/wiki/rosinstall"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://../BSD-Willow.txt;md5=51a25bf2b127f8eb390aa2c2d5ca028d"

DEPENDS = ""
SRCNAME = "rosinstall"
PR = "r0"

SRC_URI = "http://pr.willowgarage.com/downloads/rosinstall/rosinstall-0.6.20.tar.gz;name=rosinstall \
           file://BSD-Willow.txt "

SRC_URI[rosinstall.md5sum] = "ca0f79f125fb243df7c53a9f743d7e00"
SRC_URI[rosinstall.sha256sum] = "86fe5c6281ab21291a7c230433ee8c73e28119e3fb4d596a300837d214d316b2"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools native

DISTUTILS_INSTALL_ARGS = "--root=${D} \
        --prefix=${prefix} \
        --install-lib=${PYTHON_SITEPACKAGES_DIR} \
        --install-data=${datadir}"

