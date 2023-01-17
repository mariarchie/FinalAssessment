ls
cd final
cat > Домашние_животные
echo "Собаки, кошки, хомяки" >> Домашние_животные
cat > Вьючные_животные
echo "Лошади, верблюды, ослы" >> Вьючные_животные
cat > Домашние_животные Вьючные_животные > Животные
cat Животные
mv Животные Друзья_человека
mkdir newFinal
ls
mv Друзья_человека newFinal/
cd newFinal
ls
sudo wget https://dev.mysql.com/get/mysql-apt-config_0.8.18-1_all.deb
sudo apt-get update
sudo apt-get install mysql-server
sudo dpkg -i virtualbox-6.1_6.1.36-152435~Ubuntu~focal_amd64.deb
sudo apt -f install
sudo dpkg-r virtualbox-6.1
history

