#! /bin/bash
# Script generated by przyp.sh
#

paplay --volume=20000 "/home/rysio/Pobrane/PROGRAM_TV_ZEE/przypominajka.ogg" &
export DISPLAY=:0 && yad --title "Życie na pustkowiu    serial dokumentalny Wielka Brytania -" \
   --on-top --sticky --center \
   --borders=5 \
   --timeout=1200 \
   --timeout-indicator=bottom \
   --image "/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/35-0345BFDF-27B0-4D2F-8AF2-E97A44C39264 BBC_Earth 20-55 ŻYCIE 7_PICTURE_OUT.png" \
   --button="Otwórz obrazki"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/35-0345BFDF-27B0-4D2F-8AF2-E97A44C39264_PIC.sh" \
   --button="Otwórz forum"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/35-0345BFDF-27B0-4D2F-8AF2-E97A44C39264_FORUM.sh" \
   --button="Otwórz URL"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/35-0345BFDF-27B0-4D2F-8AF2-E97A44C39264_URL.sh" \
   --button=gtk-quit\:1 &