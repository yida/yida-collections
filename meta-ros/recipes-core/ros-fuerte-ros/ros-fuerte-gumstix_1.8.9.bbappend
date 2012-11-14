#DESCRIPTION = "ROS for Gumstix"

VER_ros = "1.8.9"

SRC_URI += "git://github.com/wg-debs/ros-release.git;destsuffix=ros;name=ros \
            file://0001-add-modification.patch;apply=yes;patchdir=ros;pnum=1 \
            file://0002-set-no_cmake_find_root_path-to-find_program.patch;apply=yes;patchdir=ros;pnum=1 \
            file://0003-add-NO_CMAKE_FIND_ROOT_PATH-to-rospack-search.patch;apply=yes;patchdir=ros;pnum=1 \
            file://0004-fix-private-and-public.cmake-for-cross-compilation.patch;apply=yes;patchdir=ros;pnum=1"


SRCREV_ros = "debian/ros-fuerte-ros_${VER_ros}_lucid"
