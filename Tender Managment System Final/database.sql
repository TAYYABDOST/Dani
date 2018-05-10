-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 26, 2017 at 10:24 AM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 5.6.20

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `database`
--

-- --------------------------------------------------------

--
-- Table structure for table `characteristics`
--

CREATE TABLE `characteristics` (
  `id` int(50) NOT NULL,
  `value` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `characteristic_type`
--

CREATE TABLE `characteristic_type` (
  `id` int(50) NOT NULL,
  `name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='characteristics type';

-- --------------------------------------------------------

--
-- Table structure for table `client`
--

CREATE TABLE `client` (
  `clientid` int(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `startdate` date DEFAULT NULL,
  `enddate` date DEFAULT NULL,
  `contact` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `address` varchar(100) NOT NULL,
  `status` varchar(100) DEFAULT NULL,
  `companyname` varchar(50) NOT NULL,
  `ntnno` varchar(50) NOT NULL,
  `image` longblob,
  `balance` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='about client ';

-- --------------------------------------------------------

--
-- Table structure for table `generate_bill`
--

CREATE TABLE `generate_bill` (
  `billno` int(100) NOT NULL,
  `vendorid` int(100) NOT NULL,
  `date` date NOT NULL,
  `status` varchar(100) NOT NULL,
  `marketname` varchar(100) NOT NULL,
  `marketaddress` varchar(100) NOT NULL,
  `productname` varchar(100) NOT NULL,
  `ms` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='generate bill';

-- --------------------------------------------------------

--
-- Table structure for table `generate_bill_li`
--

CREATE TABLE `generate_bill_li` (
  `status` varchar(50) NOT NULL,
  `itemid` varchar(50) NOT NULL,
  `quantity` varchar(50) NOT NULL,
  `description` varchar(200) NOT NULL,
  `unitprice` varchar(50) NOT NULL,
  `quotationid` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='generation of bill system line item.';

-- --------------------------------------------------------

--
-- Table structure for table `generate_payment`
--

CREATE TABLE `generate_payment` (
  `paymentid` int(100) NOT NULL,
  `date` date NOT NULL,
  `totalamount` varchar(100) NOT NULL,
  `currency` varchar(100) NOT NULL,
  `status` varchar(100) NOT NULL,
  `billno` varchar(100) NOT NULL,
  `paidamount` varchar(100) NOT NULL,
  `balance` varchar(100) NOT NULL,
  `vendorid` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='generate payment to market';

-- --------------------------------------------------------

--
-- Table structure for table `generate_quotation`
--

CREATE TABLE `generate_quotation` (
  `quotationno` int(50) NOT NULL,
  `tid` int(100) NOT NULL,
  `date` date NOT NULL,
  `status` varchar(50) NOT NULL,
  `referenceno` varchar(100) NOT NULL,
  `patternno` varchar(100) NOT NULL,
  `ntnno` varchar(100) NOT NULL,
  `description` varchar(200) NOT NULL,
  `delivery` varchar(100) NOT NULL,
  `validity` varchar(50) NOT NULL,
  `lprno` varchar(100) NOT NULL,
  `itconfirmed` varchar(50) NOT NULL,
  `clientid` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='generation of quotation ';

-- --------------------------------------------------------

--
-- Table structure for table `generate_quotation_li`
--

CREATE TABLE `generate_quotation_li` (
  `unitpricegst` int(50) NOT NULL,
  `quantity` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='generate quotation line item';

-- --------------------------------------------------------

--
-- Table structure for table `get_rates`
--

CREATE TABLE `get_rates` (
  `id` int(50) NOT NULL,
  `vendorid` int(100) NOT NULL,
  `status` varchar(100) NOT NULL,
  `lprno` varchar(50) NOT NULL,
  `date` date NOT NULL,
  `nsnno` varchar(100) NOT NULL,
  `description` varchar(500) NOT NULL,
  `price` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='getting rates from market';

-- --------------------------------------------------------

--
-- Table structure for table `issue_material`
--

CREATE TABLE `issue_material` (
  `lprno` int(50) NOT NULL,
  `date` date NOT NULL,
  `status` varchar(50) NOT NULL,
  `quantity` varchar(50) NOT NULL,
  `particulars` varchar(100) NOT NULL,
  `ms` varchar(100) NOT NULL,
  `lpono` varchar(50) NOT NULL,
  `clientid` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='issuing material';

-- --------------------------------------------------------

--
-- Table structure for table `issue_material_li`
--

CREATE TABLE `issue_material_li` (
  `status` varchar(50) NOT NULL,
  `idnumber` int(50) NOT NULL,
  `quantity` varchar(100) NOT NULL,
  `unitprice` varchar(100) NOT NULL,
  `description` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='issue material line item';

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `UserID` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`UserID`, `password`) VALUES
('admin', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `pay_the_payment`
--

CREATE TABLE `pay_the_payment` (
  `name` varchar(50) NOT NULL,
  `sdate` date NOT NULL,
  `status` varchar(50) NOT NULL,
  `chequeno` int(50) NOT NULL,
  `chequedate` date NOT NULL,
  `noofcheque` varchar(50) NOT NULL,
  `billno` varchar(50) NOT NULL,
  `accno` varchar(50) NOT NULL,
  `address` varchar(100) NOT NULL,
  `itax` varchar(50) NOT NULL,
  `gst` varchar(50) NOT NULL,
  `price` varchar(50) NOT NULL,
  `totalsum` varchar(50) NOT NULL,
  `currency` varchar(50) NOT NULL,
  `enddate` varchar(50) NOT NULL,
  `clientid` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='paying the payment ';

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `name` varchar(100) NOT NULL,
  `unit` varchar(100) NOT NULL,
  `quantity` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `purchase_order`
--

CREATE TABLE `purchase_order` (
  `lprno` varchar(100) NOT NULL,
  `date` date NOT NULL,
  `status` varchar(100) NOT NULL,
  `address` varchar(100) NOT NULL,
  `lpono` varchar(100) NOT NULL,
  `budgetcode` varchar(100) NOT NULL,
  `deliverydate` varchar(100) NOT NULL,
  `quotationno` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='purchase order ';

-- --------------------------------------------------------

--
-- Table structure for table `purchase_order_li`
--

CREATE TABLE `purchase_order_li` (
  `status` varchar(100) NOT NULL,
  `poid` int(50) NOT NULL,
  `quantity` varchar(100) NOT NULL,
  `unitprice` varchar(50) NOT NULL,
  `totalprice` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='purchase order line item';

-- --------------------------------------------------------

--
-- Table structure for table `ratedetails`
--

CREATE TABLE `ratedetails` (
  `tenderid` int(50) NOT NULL,
  `itemid` int(50) NOT NULL,
  `quantity` varchar(50) NOT NULL,
  `price` varchar(50) NOT NULL,
  `status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='details about the rate';

-- --------------------------------------------------------

--
-- Table structure for table `tender`
--

CREATE TABLE `tender` (
  `tid` int(100) NOT NULL,
  `lprno` varchar(100) NOT NULL,
  `partno` varchar(100) NOT NULL,
  `nsnno` varchar(50) NOT NULL,
  `description` varchar(200) NOT NULL,
  `quantity` varchar(100) NOT NULL,
  `deno` varchar(100) NOT NULL,
  `date` date NOT NULL,
  `clientid` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tender_details`
--

CREATE TABLE `tender_details` (
  `tenderid` int(50) NOT NULL,
  `itemid` int(50) NOT NULL,
  `quantity` varchar(100) NOT NULL,
  `price` varchar(50) NOT NULL,
  `status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='tender details';

-- --------------------------------------------------------

--
-- Table structure for table `vendor`
--

CREATE TABLE `vendor` (
  `vendorid` int(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  `startdate` date DEFAULT NULL,
  `enddate` date DEFAULT NULL,
  `contact` varchar(100) NOT NULL,
  `address` varchar(100) NOT NULL,
  `balance` varchar(100) DEFAULT NULL,
  `status` varchar(100) DEFAULT NULL,
  `image` longblob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `characteristics`
--
ALTER TABLE `characteristics`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `characteristic_type`
--
ALTER TABLE `characteristic_type`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`clientid`);

--
-- Indexes for table `generate_bill`
--
ALTER TABLE `generate_bill`
  ADD PRIMARY KEY (`billno`);

--
-- Indexes for table `generate_bill_li`
--
ALTER TABLE `generate_bill_li`
  ADD PRIMARY KEY (`itemid`);

--
-- Indexes for table `generate_payment`
--
ALTER TABLE `generate_payment`
  ADD PRIMARY KEY (`paymentid`);

--
-- Indexes for table `generate_quotation`
--
ALTER TABLE `generate_quotation`
  ADD PRIMARY KEY (`quotationno`);

--
-- Indexes for table `get_rates`
--
ALTER TABLE `get_rates`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `issue_material`
--
ALTER TABLE `issue_material`
  ADD PRIMARY KEY (`lprno`);

--
-- Indexes for table `issue_material_li`
--
ALTER TABLE `issue_material_li`
  ADD PRIMARY KEY (`idnumber`);

--
-- Indexes for table `purchase_order_li`
--
ALTER TABLE `purchase_order_li`
  ADD PRIMARY KEY (`poid`);

--
-- Indexes for table `ratedetails`
--
ALTER TABLE `ratedetails`
  ADD PRIMARY KEY (`tenderid`);

--
-- Indexes for table `tender`
--
ALTER TABLE `tender`
  ADD PRIMARY KEY (`tid`);

--
-- Indexes for table `tender_details`
--
ALTER TABLE `tender_details`
  ADD PRIMARY KEY (`tenderid`,`itemid`);

--
-- Indexes for table `vendor`
--
ALTER TABLE `vendor`
  ADD PRIMARY KEY (`vendorid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `characteristics`
--
ALTER TABLE `characteristics`
  MODIFY `id` int(50) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `characteristic_type`
--
ALTER TABLE `characteristic_type`
  MODIFY `id` int(50) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `client`
--
ALTER TABLE `client`
  MODIFY `clientid` int(50) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `generate_bill`
--
ALTER TABLE `generate_bill`
  MODIFY `billno` int(100) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `generate_payment`
--
ALTER TABLE `generate_payment`
  MODIFY `paymentid` int(100) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `generate_quotation`
--
ALTER TABLE `generate_quotation`
  MODIFY `quotationno` int(50) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `get_rates`
--
ALTER TABLE `get_rates`
  MODIFY `id` int(50) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tender`
--
ALTER TABLE `tender`
  MODIFY `tid` int(100) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `vendor`
--
ALTER TABLE `vendor`
  MODIFY `vendorid` int(100) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
