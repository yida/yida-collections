DESCRIPTION = "nose extends unittest to make testing easier"
HOMEPAGE = "http://readthedocs.org/docs/nose/"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://lgpl.txt;md5=a6f89e2100d9b6cdffcea4f398e37343"

DEPENDS = ""
SRCNAME = "nose"
PR = "r0"

SRC_URI = "http://pypi.python.org/packages/source/n/nose/nose-1.2.1.tar.gz;name=nose"
SRC_URI[nose.md5sum] = "735e3f1ce8b07e70ee1b742a8a53585a"
SRC_URI[nose.sha256sum] = "2171e9202d118d302d5db1decb52dd862b79e2a626ca19653a6914574a6ca7d9"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools native

DISTUTILS_INSTALL_ARGS = "--root=${D} \
        --prefix=${prefix} \
        --install-lib=${PYTHON_SITEPACKAGES_DIR} \
        --install-data=${datadir}"

