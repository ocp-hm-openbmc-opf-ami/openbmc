SUMMARY = "PFR Manager Service"
DESCRIPTION = "Daemon to handle all PFR functionalities"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7becf906c8f8d03c237bad13bc3dac53"
inherit cmake systemd

SRC_URI = "git://github.com/openbmc/pfr-manager;branch=master;protocol=https"

PV = "0.1+git${SRCPV}"
SRCREV = "1388f6cf6c0e287331e5be6062bd0f58310e1bd0"

S = "${WORKDIR}/git"

SYSTEMD_SERVICE:${PN} = "xyz.openbmc_project.PFR.Manager.service"

DEPENDS += " \
    sdbusplus \
    phosphor-logging \
    boost \
    i2c-tools \
    libgpiod \
    "
