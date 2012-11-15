include boost-ros.inc 

inherit native

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE_1_0.txt;md5=e4224ccaecb14d942c71d31bef20d78c"

PR = "${INC_PR}.1"

SRC_URI[md5sum] = "0d202cb811f934282dea64856a175698"
SRC_URI[sha256sum] = "dd748a7f5507a7e7af74f452e1c52a64e651ed1f7263fce438a06641d2180d3c"

prefix = "${STAGING_DIR_NATIVE}/opt/ros/fuerte"
exec_prefix = "${prefix}"
libdir = "${prefix}/lib"
libexecdir = "${prefix}/libexec"
includedir = "${prefix}/include"
