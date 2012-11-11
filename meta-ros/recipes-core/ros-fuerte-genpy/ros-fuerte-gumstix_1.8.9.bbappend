
VER_genpy = "0.3.7"

SRC_URI += "git://github.com/wg-debs/genpy-release.git;destsuffix=genpy;name=genpy \
            file://0001-add-NO_CMAKE_FIND_ROOT_PATH-to-genpy-extra.patch;apply=yes;patchdir=genpy;pnum=1"

SRCREV_genpy = "debian/ros-fuerte-genpy_${VER_genpy}_lucid" 

