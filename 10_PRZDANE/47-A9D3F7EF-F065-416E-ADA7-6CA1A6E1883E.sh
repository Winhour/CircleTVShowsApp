#! /bin/bash
# Script generated by przyp.sh
#

paplay --volume=20000 "/home/rysio/Pobrane/PROGRAM_TV_ZEE/przypominajka.ogg" &
export DISPLAY=:0 && yad --title "Zbudujmy to jeszcze raz    Wenecja serial dokumentalny Kanada " \
   --on-top --sticky --center \
   --borders=5 \
   --timeout=1200 \
   --timeout-indicator=bottom \
   --image "/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/47-A9D3F7EF-F065-416E-ADA7-6CA1A6E1883E Planete_HD 22-00 ZBUDUJMY 7_PICTURE_OUT.png" \
   --button="Otwórz obrazki"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/47-A9D3F7EF-F065-416E-ADA7-6CA1A6E1883E_PIC.sh" \
   --button="Otwórz forum"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/47-A9D3F7EF-F065-416E-ADA7-6CA1A6E1883E_FORUM.sh" \
   --button="Otwórz URL"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/47-A9D3F7EF-F065-416E-ADA7-6CA1A6E1883E_URL.sh" \
   --button=gtk-quit\:1 &
