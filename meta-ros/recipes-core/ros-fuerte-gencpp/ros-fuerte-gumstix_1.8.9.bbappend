
VER_gencpp = "0.3.4"

SRC_URI += "git://github.com/wg-debs/gencpp-release.git;destsuffix=gencpp;name=gencpp \
            file://0001-add-NO_CMAKE_FIND_ROOT_PATH-to-gencpp-extras.patch;apply=yes;patchdir=gencpp;pnum=1"

SRCREV_gencpp = "debian/ros-fuerte-gencpp_${VER_gencpp}_lucid" 

