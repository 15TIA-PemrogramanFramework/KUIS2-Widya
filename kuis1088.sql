-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 13 Des 2017 pada 16.18
-- Versi Server: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kuis1088`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `identitas_1088`
--

CREATE TABLE `identitas_1088` (
  `nim` varchar(255) NOT NULL,
  `kampus` varchar(255) DEFAULT NULL,
  `nama` varchar(50) NOT NULL,
  `prodi` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `identitas_1088`
--

INSERT INTO `identitas_1088` (`nim`, `kampus`, `nama`, `prodi`) VALUES
('1555301036', 'Politeknik Caltex Riau', 'Ivonn', 'TI');

-- --------------------------------------------------------

--
-- Struktur dari tabel `ipk_1088`
--

CREATE TABLE `ipk_1088` (
  `id` bigint(20) NOT NULL,
  `ip` int(11) NOT NULL,
  `nim` varchar(30) NOT NULL,
  `tahun` int(11) NOT NULL,
  `identitas_nim` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `ipk_1088`
--

INSERT INTO `ipk_1088` (`id`, `ip`, `nim`, `tahun`, `identitas_nim`) VALUES
(1, 5, '1555301036', 2017, '1555301036'),
(2, 3, '1555301036', 2017, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `identitas_1088`
--
ALTER TABLE `identitas_1088`
  ADD PRIMARY KEY (`nim`);

--
-- Indexes for table `ipk_1088`
--
ALTER TABLE `ipk_1088`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKtm41un95cdadpo5ir06bob3b6` (`identitas_nim`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `ipk_1088`
--
ALTER TABLE `ipk_1088`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `ipk_1088`
--
ALTER TABLE `ipk_1088`
  ADD CONSTRAINT `FKtm41un95cdadpo5ir06bob3b6` FOREIGN KEY (`identitas_nim`) REFERENCES `identitas_1088` (`nim`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
