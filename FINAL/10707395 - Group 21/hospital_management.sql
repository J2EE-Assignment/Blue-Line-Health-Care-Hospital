-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 28, 2021 at 08:47 AM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hospital_management`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin_login`
--

CREATE TABLE `admin_login` (
  `username` varchar(16) NOT NULL,
  `password` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin_login`
--

INSERT INTO `admin_login` (`username`, `password`) VALUES
('admin', 'pass');

-- --------------------------------------------------------

--
-- Table structure for table `appointments`
--

CREATE TABLE `appointments` (
  `nic` varchar(13) NOT NULL,
  `doctorsName` varchar(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `appointments`
--

INSERT INTO `appointments` (`nic`, `doctorsName`) VALUES
('asfd', '18'),
('adfasf', 'dsfa'),
('sdafdas', 'dsfa');

-- --------------------------------------------------------

--
-- Table structure for table `doctor_details`
--

CREATE TABLE `doctor_details` (
  `id` int(11) NOT NULL,
  `name` varchar(16) NOT NULL,
  `regNo` varchar(16) NOT NULL,
  `address` varchar(30) NOT NULL,
  `telNo` int(10) NOT NULL,
  `type` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doctor_details`
--

INSERT INTO `doctor_details` (`id`, `name`, `regNo`, `address`, `telNo`, `type`) VALUES
(18, 'dsfa', 'adsfa', 'adfa', 324, 'sf'),
(19, 'af', 'afs', 'dfs', 2342, 'afd'),
(20, 'sfdf', 'sdsf', 'sfds', 324, 'sdf');

-- --------------------------------------------------------

--
-- Table structure for table `patient_details`
--

CREATE TABLE `patient_details` (
  `id` int(11) NOT NULL,
  `name` varchar(40) NOT NULL,
  `address` varchar(25) NOT NULL,
  `telNo` int(10) NOT NULL,
  `gender` varchar(6) NOT NULL,
  `email` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patient_details`
--

INSERT INTO `patient_details` (`id`, `name`, `address`, `telNo`, `gender`, `email`) VALUES
(3, 'adfaafda', 'afa', 32432, 'Female', 'adfasf'),
(4, 'adf', 'adsf', 234, 'Male', 'adfsf'),
(6, 'daf', 'fsd', 324, 'Female', 'sdfsf'),
(7, 'afds', 'afd', 324, 'Female', 'sfa'),
(8, 'afds', 'afd', 324, 'Female', 'sfa'),
(9, 'sf', 'sfd', 234, 'Female', 'fsd'),
(10, 'sfs', 'sf', 234, 'Female', 'sf'),
(11, 'sf', 'f', 234, 'Female', 'adf'),
(12, 'sf', 'f', 234, 'Female', 'adf'),
(13, 'asfd', 'dfs', 324, 'Female', 'adf'),
(14, 'adf', 'asdfa', 234, 'Female', 'asdfa'),
(15, 'sdfds', 'dsfsd', 4324, 'Female', 'asdf');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `doctor_details`
--
ALTER TABLE `doctor_details`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `patient_details`
--
ALTER TABLE `patient_details`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `doctor_details`
--
ALTER TABLE `doctor_details`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `patient_details`
--
ALTER TABLE `patient_details`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
