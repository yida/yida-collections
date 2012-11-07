DESCRIPTION = "hello world sample program"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=71b18f09f3083168e101f66dac77f219"
DEPENDS = ""
PR = "r0"
SRC_URI = "file://hello.c; \
           file://COPYING"

S = "${WORKDIR}"

do_compile () {
    ${CC} ${CFLAGS} ${LDFLAGS} -o hello hello.c
}

do_install () {
    install -d ${D}${bindir}/
      install -m 0755 ${S}/hello ${D}${bindir}/
}
FILES_${PN} = "${bindir}/hello"
