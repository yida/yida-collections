DESCRIPTION = "Optik is a powerful, flexible, extensible, easy-to-use command-line parsing library for Python"
HOMEPAGE = "http://optik.sourceforge.net/"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://README.txt;md5=a17fc165e08a3f652c0ca85fdd31777c"

DEPENDS = ""
SRCNAME = "optik"
PR = "r0"

SRC_URI = "${SOURCEFORGE_MIRROR}/optik/optik-${PV}.tar.gz;name=optik"
SRC_URI[optik.md5sum] = "4e811a356d51bea8d6dbab479ed000fb"
SRC_URI[optik.sha256sum] = "e000c4b60a9c83c355fc828d2bf72c4d3abb80e8f45ee5176d0424dd609d352f"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools

DISTUTILS_INSTALL_ARGS = "--root=${D} \
        --prefix=${prefix} \
        --install-lib=${PYTHON_SITEPACKAGES_DIR} \
        --install-data=${datadir}"

