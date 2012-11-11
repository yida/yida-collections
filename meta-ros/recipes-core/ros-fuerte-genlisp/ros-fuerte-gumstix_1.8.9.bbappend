
VER_genlisp = "0.3.3"

SRC_URI += "git://github.com/wg-debs/genlisp-release.git;destsuffix=genlisp;name=genlisp \
            file://0001-find_program-set-no-cmake_find_root_path.patch;apply=yes;patchdir=genlisp;pnum=1"

SRCREV_genlisp = "debian/ros-fuerte-genlisp_${VER_genlisp}_lucid" 

