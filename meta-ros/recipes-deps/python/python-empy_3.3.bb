DESCRIPTION = "A powerful and robust templating system for Python"
HOMEPAGE = "http://www.alcyone.com/software/empy"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://COPYING;md5=7fbc338309ac38fefcd64b04bb903e34"

DEPENDS = ""
SRCNAME = "empy"
PR = "r0"

SRC_URI = "http://www.alcyone.com/software/empy/empy-latest.tar.gz;name=empy"
SRC_URI[empy.md5sum] = "e7b518a6fc4fd28fef87726cdb003118"
SRC_URI[empy.sha256sum] = "c625436d03cff8adbbade639d14a2df9bc4c4de99ec3a821ad4d6eeb66ade805"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools

DISTUTILS_INSTALL_ARGS = "--root=${D} \
        --prefix=${prefix} \
        --install-lib=${PYTHON_SITEPACKAGES_DIR} \
        --install-data=${datadir}"

