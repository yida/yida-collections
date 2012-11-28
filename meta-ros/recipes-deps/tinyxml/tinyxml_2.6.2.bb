DESCRIPTION = "TinyXML is a simple, small, minimal, C++ XML parser that can be easily integrating into other programs. It reads XML and creates C++ objects representing the XML document. The objects can be manipulated, changed, and saved again as XML."
SECTION = "libs"
DEPENDS = ""
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://../BSD-Willow.txt;md5=51a25bf2b127f8eb390aa2c2d5ca028d"
HOMEPAGE = "http://www.grinninglizard.com/tinyxml/"

PR = "r4"

SRC_URI = "https://kforge.ros.org/rosrelease/viewvc/sourcedeps/tinyxml/tinyxml_2_6_2_stl_enabled.tar.gz \
            file://BSD-Willow.txt"

#build this:
S = "${WORKDIR}/${PN}"

inherit cmake

SRC_URI[md5sum] = "35efe59f25b7980a6f3ec0118908cc11"
SRC_URI[sha256sum] = "14cff07338d9be734b014ea7a8b754d4646521ee7fc28cd136514dd45e2c0933"

FILES_${PN} = "${libdir}/lib*.so ${includedir}/*"
FILES_${PN}-dev = "${libdir}/lib*.so ${includedir}/*"
