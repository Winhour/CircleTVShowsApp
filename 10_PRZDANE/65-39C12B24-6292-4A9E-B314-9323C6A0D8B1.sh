#! /bin/bash
# Script generated by przyp.sh
#

paplay --volume=20000 "/home/rysio/Pobrane/PROGRAM_TV_ZEE/przypominajka.ogg" &
export DISPLAY=:0 && yad --title "Miłość w Nowym Jorku melodramat USA 2000 ^^" \
   --on-top --sticky --center \
   --borders=5 \
   --timeout=1200 \
   --timeout-indicator=bottom \
   --image "/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/65-39C12B24-6292-4A9E-B314-9323C6A0D8B1 TVP_2 23-30 MIŁOŚĆ 7_PICTURE_OUT.png" \
   --button="Otwórz obrazki"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/65-39C12B24-6292-4A9E-B314-9323C6A0D8B1_PIC.sh" \
   --button="Otwórz forum"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/65-39C12B24-6292-4A9E-B314-9323C6A0D8B1_FORUM.sh" \
   --button="Otwórz URL"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/65-39C12B24-6292-4A9E-B314-9323C6A0D8B1_URL.sh" \
   --button=gtk-quit\:1 &