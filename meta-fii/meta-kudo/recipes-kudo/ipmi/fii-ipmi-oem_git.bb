SUMMARY = "foxconn OEM IPMI commands"
DESCRIPTION = "foxconn OEM IPMI commands"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

S = "${WORKDIR}/git"

DEPENDS = "boost phosphor-ipmi-host phosphor-logging systemd libgpiod"

inherit meson pkgconfig

SRC_URI = "git://github.com/openbmc/foxconn-ipmi-oem.git;branch=master;protocol=https"
SRCREV = "c2663f1c98ad690e150736896bcfdca6a15f391a"

FILES:${PN}:append = " ${libdir}/ipmid-providers"
FILES:${PN}:append = " ${libdir}/host-ipmid"
FILES:${PN}:append = " ${libdir}/net-ipmid"
