/* 
 * Copyright (c) 2020 Xilinx, Inc. 
 * All rights reserved.
 *
 * Author: Chris Lavin, Xilinx Research Labs.
 *  
 * This file is part of RapidWright. 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
/**
 * 
 */
package com.xilinx.rapidwright.device;


/**
 * Generated on: Wed Nov 18 14:16:24 2020
 * by: com.xilinx.rapidwright.release.SiteAndTileTypeUpdater
 * 
 * Enumeration of Tile type for all valid devices within Vivado.
 */
public enum TileTypeEnum {
	AIE_INTF_A_CORE,
	AIE_INTF_B0_CORE,
	AIE_INTF_B1_CORE,
	AIE_INTF_B2_CORE,
	AIE_INTF_B3_CORE,
	AIE_INTF_C_CORE,
	AIE_TILE,
	AIE_TILE_MY,
	AMS,
	AMS_ADC_TOP,
	AMS_AMS_FILL_FT,
	AMS_AMS_FILL_TERM_T_FT,
	AMS_BRAM,
	AMS_CLB_INTF_IOB,
	AMS_CLK,
	AMS_CMT,
	AMS_DAC_TOP,
	AMS_DRP_ADC_TOP,
	AMS_DRP_DAC_TOP,
	AMS_DSP,
	AMS_INT,
	AMS_INT_L,
	AMS_INT_R,
	AMS_IOI,
	AMS_M12BUF_AMS_ALTO_AUX_IO_BOT_L_FT,
	AMS_M12BUF_AMS_ALTO_AUX_IO_TOP_L_FT,
	AMS_M12BUF_AMS_BOT_L_FT,
	AMS_M12BUF_AMS_BOT_R_FT,
	AMS_M12BUF_AMS_TOP_L_FT,
	AMS_M12BUF_AMS_TOP_R_FT,
	AMS_M12BUF_BOT_L,
	AMS_M12BUF_BOT_L_FT,
	AMS_M12BUF_BOT_R,
	AMS_M12BUF_BOT_R_FT,
	AMS_M12BUF_CTR_LEFT_AMS_ALTO_BOT_L_FT,
	AMS_M12BUF_CTR_LEFT_AMS_ALTO_TOP_L_FT,
	AMS_M12BUF_CTR_RIGHT_AMS_ALTO_BOT_L_FT,
	AMS_M12BUF_CTR_RIGHT_AMS_ALTO_TOP_L_FT,
	AMS_M12BUF_CTR_RIGHT_BOT_L_FT,
	AMS_M12BUF_CTR_RIGHT_TOP_L_FT,
	AMS_M12BUF_IO_AMS_ALTO_BOT_L_FT,
	AMS_M12BUF_IO_AMS_ALTO_TOP_L_FT,
	AMS_M12BUF_IO_AMS_BOT_L_FT,
	AMS_M12BUF_IO_AMS_TOP_L_FT,
	AMS_M12BUF_IO_BOT_L_FT,
	AMS_M12BUF_IO_BOT_R,
	AMS_M12BUF_IO_TOP_L_FT,
	AMS_M12BUF_IO_TOP_R,
	AMS_M12BUF_SYSMON_BOT_L_FT,
	AMS_M12BUF_SYSMON_TOP_L_FT,
	AMS_M12BUF_TOP_L,
	AMS_M12BUF_TOP_L_FT,
	AMS_M12BUF_TOP_R,
	AMS_M12BUF_TOP_R_FT,
	AMS_SAT_GT_BOT_TILE,
	AMS_SAT_GT_BOT_TILE_MY,
	AMS_SAT_GT_TOP_TILE,
	AMS_SAT_GT_TOP_TILE_MY,
	AMS_SAT_VNOC_TILE,
	AMS_TERM_T,
	AMS_VBRK_INTF,
	BLI_BLI_FT,
	BLI_BLI_TERM_H_FT,
	BLI_BRAM_LOCF_TR_TILE,
	BLI_BRAM_ROCF_TR_TILE,
	BLI_CLE_BOT_CORE,
	BLI_CLE_BOT_CORE_MY,
	BLI_CLE_TOP_CORE,
	BLI_CLE_TOP_CORE_MY,
	BLI_DSP_ROCF_BL_TILE,
	BLI_DSP_ROCF_BR_TILE,
	BLI_DSP_ROCF_TL_TILE,
	BLI_DSP_ROCF_TR_TILE,
	BLI_LS_CORE,
	BLI_LS_CORE_MX,
	BLI_LS_CORE_MY,
	BLI_LS_CORE_R180,
	BLI_URAM_LOCF_TL_TILE,
	BLI_URAM_ROCF_TL_TILE,
	BRAM,
	BRAM_BRAM_TERM_H_FT,
	BRAM_INT_INTERFACE_L,
	BRAM_INT_INTERFACE_R,
	BRAM_L,
	BRAM_LOCF_BR_TILE,
	BRAM_LOCF_TR_TILE,
	BRAM_R,
	BRAM_RBRK,
	BRAM_ROCF_BL_TILE,
	BRAM_ROCF_BR_TILE,
	BRAM_ROCF_TL_TILE,
	BRAM_ROCF_TR_TILE,
	BRAM_TERM_B,
	BRAM_TERM_P,
	BRAM_TERM_T,
	BRKH_BRAM,
	BRKH_B_TERM_INT,
	BRKH_CLB,
	BRKH_CLK,
	BRKH_CMT,
	BRKH_DSP_L,
	BRKH_DSP_R,
	BRKH_GTX,
	BRKH_INT,
	BRKH_INT_PSS,
	BRKH_TERM_INT,
	B_TERM_INT,
	B_TERM_INT_NOUTURN,
	B_TERM_INT_PSS,
	B_TERM_INT_SLV,
	B_TERM_VBRK,
	CBRK_BOT_TILE,
	CBRK_LOCF_BOT_TILE,
	CBRK_LOCF_TOP_TILE,
	CBRK_TOP_TILE,
	CFGIO_CFG_FILL_RBRK_FT,
	CFGIO_CFG_RBRK,
	CFGIO_CONFIG_RBRK,
	CFGIO_FILL_FT,
	CFGIO_IOB,
	CFGIO_IOB20,
	CFG_CENTER_BOT,
	CFG_CENTER_MID,
	CFG_CENTER_MID_SLAVE,
	CFG_CENTER_TOP,
	CFG_CENTER_TOP_SLAVE,
	CFG_CFG,
	CFG_CFG_CMAC_FILL_RBRK_FT,
	CFG_CFG_FILL_FT,
	CFG_CFG_FILL_OLY_DK_FT,
	CFG_CFG_FILL_OLY_FT,
	CFG_CFG_FILL_RBRK_FT,
	CFG_CFG_PCIE_RBRK,
	CFG_CONFIG,
	CFG_CONFIG_CMAC_RBRK_FT,
	CFG_CONFIG_HDIO_RBRK,
	CFG_CONFIG_PCIE4,
	CFG_CTR_TERM_B,
	CFG_CTR_TERM_T,
	CFG_GAP_CFGBOT,
	CFG_GAP_CFGTOP,
	CFG_M12BUF,
	CFG_M12BUF_CFG_ALTO_BOT_L_FT,
	CFG_M12BUF_CFG_ALTO_OLY_DK_BOT_L_FT,
	CFG_M12BUF_CFG_ALTO_OLY_DK_TOP_L_FT,
	CFG_M12BUF_CFG_ALTO_TERM_OLY_DK_BOT_L_FT,
	CFG_M12BUF_CFG_ALTO_TERM_OLY_DK_TOP_L_FT,
	CFG_M12BUF_CFG_ALTO_TOP_L_FT,
	CFG_M12BUF_CFG_BOT_L_FT,
	CFG_M12BUF_CFG_BOT_R,
	CFG_M12BUF_CFG_BOT_R_FT,
	CFG_M12BUF_CFG_TERM_BOT_L,
	CFG_M12BUF_CFG_TERM_TOP_L,
	CFG_M12BUF_CFG_TOP_L_FT,
	CFG_M12BUF_CFG_TOP_R,
	CFG_M12BUF_CFG_TOP_R_FT,
	CFG_M12BUF_CTR_LEFT_CFG_ALTO_TERM_BOT_L_FT,
	CFG_M12BUF_CTR_LEFT_CFG_ALTO_TERM_TOP_L_FT,
	CFG_M12BUF_CTR_LEFT_FT,
	CFG_M12BUF_CTR_RIGHT_CFG_ALTO_BOT_L_FT,
	CFG_M12BUF_CTR_RIGHT_CFG_ALTO_TOP_L_FT,
	CFG_M12BUF_CTR_RIGHT_CFG_OLY_BOT_L_FT,
	CFG_M12BUF_CTR_RIGHT_CFG_OLY_DK_BOT_L_FT,
	CFG_M12BUF_CTR_RIGHT_CFG_OLY_DK_TOP_L_FT,
	CFG_M12BUF_CTR_RIGHT_CFG_OLY_TOP_L_FT,
	CFG_M12BUF_CTR_RIGHT_FT,
	CFG_M12BUF_IO_CFG_ALTO_BOT_L_FT,
	CFG_M12BUF_IO_CFG_ALTO_OLY_DK_BOT_L_FT,
	CFG_M12BUF_IO_CFG_ALTO_OLY_DK_TOP_L_FT,
	CFG_M12BUF_IO_CFG_ALTO_TOP_L_FT,
	CFG_M12BUF_IO_CFG_BOT_L_FT,
	CFG_M12BUF_IO_CFG_BOT_R,
	CFG_M12BUF_IO_CFG_TOP_L_FT,
	CFG_M12BUF_IO_CFG_TOP_R,
	CFG_M12BUF_IO_L_FT,
	CFG_M12BUF_RBRK_L,
	CFG_M12BUF_RBRK_R,
	CFG_M12BUF_TERM_B_L,
	CFG_M12BUF_TERM_B_R,
	CFG_M12BUF_TERM_H_L_FT,
	CFG_M12BUF_TERM_H_R_FT,
	CFG_M12BUF_TERM_L,
	CFG_M12BUF_TERM_P,
	CFG_M12BUF_TERM_T_L,
	CFG_M12BUF_TERM_T_R,
	CFG_PCIE_AMS_RBRK,
	CFG_PCIE_RBRK,
	CFG_SECURITY_BOT_PELE1,
	CFG_SECURITY_MID_PELE1,
	CFG_SECURITY_TOP_PELE1,
	CFRM_AMS_CFGIO,
	CFRM_B,
	CFRM_B_RBRK,
	CFRM_CBRK_CTR_LEFT_L_FT,
	CFRM_CBRK_CTR_RIGHT_L_FT,
	CFRM_CBRK_IO_L,
	CFRM_CBRK_IO_R,
	CFRM_CBRK_L,
	CFRM_CBRK_L_RBRK,
	CFRM_CBRK_L_TERM_B,
	CFRM_CBRK_L_TERM_H_FT,
	CFRM_CBRK_L_TERM_P,
	CFRM_CBRK_L_TERM_T,
	CFRM_CBRK_R,
	CFRM_CBRK_R_RBRK,
	CFRM_CBRK_R_TERM_B,
	CFRM_CBRK_R_TERM_H_FT,
	CFRM_CBRK_R_TERM_T,
	CFRM_CFG,
	CFRM_CFRAME_DMAH_TERM_T_FT,
	CFRM_CFRAME_TERM_H_FT,
	CFRM_CONFIG,
	CFRM_CPM_TILE,
	CFRM_FSR_TILE,
	CFRM_HFSR_TILE,
	CFRM_L_RBRK,
	CFRM_L_TERM_B,
	CFRM_L_TERM_T,
	CFRM_PMC_TILE,
	CFRM_RBRK_B,
	CFRM_RBRK_CFGIO,
	CFRM_RBRK_PCIE,
	CFRM_R_RBRK,
	CFRM_R_TERM_B,
	CFRM_R_TERM_T,
	CFRM_T,
	CFRM_TERM_B,
	CFRM_TERM_T,
	CFRM_T_RBRK,
	CLBLL_L,
	CLBLL_R,
	CLBLM_L,
	CLBLM_R,
	CLEL_L,
	CLEL_L_RBRK,
	CLEL_L_TERM_B,
	CLEL_L_TERM_T,
	CLEL_R,
	CLEL_R_RBRK,
	CLEL_R_TERM_B,
	CLEL_R_TERM_T,
	CLEM,
	CLEM_R,
	CLEM_RBRK,
	CLEM_TERM_B,
	CLEM_TERM_T,
	CLE_BC_CORE,
	CLE_BC_CORE_MX,
	CLE_CLE_L_LEFT_TERM_H_FT,
	CLE_CLE_L_LEFT_TERM_P_FT,
	CLE_CLE_L_RIGHT_TERM_H_FT,
	CLE_CLE_M_DECAP_FT,
	CLE_CLE_M_DECAP_RBRK_FT,
	CLE_CLE_M_DECAP_TERM_H_FT,
	CLE_CLE_M_TERM_H_FT,
	CLE_E_CORE,
	CLE_L_RIGHT_TERM_P,
	CLE_L_R_RBRK,
	CLE_M,
	CLE_M_INTF_TERM_PSS_RBRK,
	CLE_M_R,
	CLE_M_RBRK,
	CLE_M_TERM_B,
	CLE_M_TERM_P,
	CLE_M_TERM_T,
	CLE_W_CORE,
	CLK_BALI_REBUF,
	CLK_BALI_REBUF_GTZ_BOT,
	CLK_BALI_REBUF_GTZ_TOP,
	CLK_BUFG_BOT_R,
	CLK_BUFG_REBUF,
	CLK_BUFG_TOP_R,
	CLK_FEED,
	CLK_GT_AAA_TILE,
	CLK_GT_AAA_TILE_MY,
	CLK_GT_BBA_TILE,
	CLK_GT_BBA_TILE_MY,
	CLK_GT_CCA_TILE,
	CLK_GT_CCA_TILE_MY,
	CLK_HROW_BOT_R,
	CLK_HROW_TOP_R,
	CLK_IBRK_FSR2IO,
	CLK_MTBF2,
	CLK_PLL_AND_PHY,
	CLK_PMV,
	CLK_PMV2,
	CLK_PMV2_SVT,
	CLK_PMVIOB,
	CLK_REBUF_BUFGS_HSR_CORE,
	CLK_REBUF_HSR_ME_TNOC_CORE,
	CLK_REBUF_HSR_ME_TNOC_CORE_MX,
	CLK_REBUF_VERT_GT_ACA_TILE,
	CLK_REBUF_VERT_GT_ACA_TILE_MY,
	CLK_REBUF_VERT_GT_BAA_TILE,
	CLK_REBUF_VERT_GT_BAA_TILE_MY,
	CLK_REBUF_VERT_GT_CBA_TILE,
	CLK_REBUF_VERT_GT_COA_TILE,
	CLK_REBUF_VERT_GT_COA_TILE_MY,
	CLK_REBUF_VERT_VNOC_ACA_TILE,
	CLK_REBUF_VERT_VNOC_BAA_TILE,
	CLK_REBUF_VERT_VNOC_CBA_TILE,
	CLK_REBUF_VERT_VNOC_TOP_COA_TILE,
	CLK_TERM,
	CLK_VERT_TO_HSR_GT_OCA_TILE,
	CLK_VERT_TO_HSR_VNOC_OCA_TILE,
	CLK_VNOC_AAA_TILE,
	CLK_VNOC_BBA_TILE,
	CLK_VNOC_CCA_TILE,
	CLK_VNOC_PSS_CCA_TILE,
	CMAC,
	CMAC_AMS_FILL_RBRK_FT,
	CMAC_AMS_RBRK_FT,
	CMAC_CMAC_AMS_RBRK_FT,
	CMAC_CMAC_CFG_TERM_T_FT,
	CMAC_CMAC_FT,
	CMAC_CMAC_LEFT_RBRK_FT,
	CMAC_CMAC_LEFT_TERM_T_FT,
	CMAC_CMAC_PCIE3_RBRK_FT,
	CMAC_CMAC_TERM_P_FT,
	CMAC_CMAC_TERM_T_FT,
	CMAC_HDIO_FILL_RBRK_FT,
	CMAC_HDIO_RBRK_FT,
	CMAC_ILKN_RBRK_FT,
	CMAC_PCIE3_CMAC_RBRK_FT,
	CMAC_PCIE4_RBRK_FT,
	CMAC_RBRK,
	CMAC_TERM_B,
	CMR_RIGHT_TERM_T,
	CMT_CMT_LEFT_TERM_P_FT,
	CMT_DPLL,
	CMT_DPLL_MY,
	CMT_FIFO_L,
	CMT_FIFO_R,
	CMT_L,
	CMT_LEFT_H,
	CMT_L_RBRK,
	CMT_L_TERM_B,
	CMT_L_TERM_T,
	CMT_MMCM,
	CMT_PMV,
	CMT_PMV_L,
	CMT_RIGHT,
	CMT_RIGHT_RBRK,
	CMT_RIGHT_TERM_B,
	CMT_TOP_L_LOWER_B,
	CMT_TOP_L_LOWER_T,
	CMT_TOP_L_UPPER_B,
	CMT_TOP_L_UPPER_T,
	CMT_TOP_R_LOWER_B,
	CMT_TOP_R_LOWER_T,
	CMT_TOP_R_UPPER_B,
	CMT_TOP_R_UPPER_T,
	CMT_XPLL,
	CPIPE_BOT_TILE,
	CPIPE_TERM_LEFT_BOT_TILE,
	CPIPE_TERM_LEFT_TOP_TILE,
	CPIPE_TERM_RIGHT_BOT_TILE,
	CPIPE_TERM_RIGHT_TOP_TILE,
	CPIPE_TOP_TILE,
	CPM_CORE,
	CPM_EXT_TILE,
	DDRMC_DMC_CORE,
	DDRMC_RIU_CORE,
	DSP,
	DSP_JTAG_TERM_P,
	DSP_L,
	DSP_R,
	DSP_RBRK,
	DSP_ROCF_B_TILE,
	DSP_ROCF_T_TILE,
	DSP_TERM_B,
	DSP_TERM_P,
	DSP_TERM_T,
	FE_FE_FT,
	FE_FE_RBRK_FT,
	FE_FE_TERM_B_FT,
	FE_FE_TERM_T_FT,
	FSR_DMC_TARGET_FT,
	FSR_GAP,
	FSR_GAP50_MINICBRK_FT,
	FSR_GAP50_MINICBRK_RBRK_FT,
	FSR_GAP50_MINICBRK_TERM_B_FT,
	FSR_GAP50_MINICBRK_TERM_T_FT,
	FSR_GAP_RBRK,
	FSR_GAP_TERM_B,
	FSR_GAP_TERM_T,
	FSR_OCTAL_GT_TILE,
	FSR_OCTAL_GT_TILE_MY,
	FSR_OCTAL_REMAP_TILE,
	FSR_OCTAL_REMAP_TILE_MY,
	FSR_QUAD_GT_TILE,
	FSR_QUAD_GT_TILE_MY,
	FSR_QUAD_REMAP_TILE,
	FSR_QUAD_REMAP_TILE_MY,
	GTH_CHANNEL_0,
	GTH_CHANNEL_1,
	GTH_CHANNEL_2,
	GTH_CHANNEL_3,
	GTH_COMMON,
	GTH_DA0_TERM_L_FT,
	GTH_DA0_TERM_L_RBRK_FT,
	GTH_DA0_TERM_L_TERM_P_FT,
	GTH_DA0_TERM_L_TERM_T_FT,
	GTH_DA7_TERM_L,
	GTH_DA7_TERM_L_RBRK,
	GTH_DA7_TERM_L_TERM_P,
	GTH_DA7_TERM_L_TERM_T,
	GTH_INT_INTERFACE,
	GTH_INT_INTERFACE_L,
	GTH_QUAD_HPIO_RBRK_FT,
	GTH_QUAD_HPIO_RIGHT_RBRK,
	GTH_QUAD_LEFT,
	GTH_QUAD_LEFT_DA0_TERM_P_FT,
	GTH_QUAD_LEFT_DA7_TERM_P,
	GTH_QUAD_LEFT_FT,
	GTH_QUAD_LEFT_RBRK,
	GTH_QUAD_LEFT_RBRK_FT,
	GTH_QUAD_LEFT_TERM_T,
	GTH_QUAD_LEFT_TERM_T_FT,
	GTH_QUAD_RIGHT,
	GTH_QUAD_RIGHT_RBRK,
	GTH_QUAD_RIGHT_TERM_B_FT,
	GTH_QUAD_RIGHT_TERM_T,
	GTH_R,
	GTH_R_RBRK,
	GTH_R_TERM_B,
	GTH_R_TERM_T,
	GTM_DUAL_LEFT_FT,
	GTM_DUAL_LEFT_RBRK_FT,
	GTM_DUAL_LEFT_TERM_B_FT,
	GTM_DUAL_LEFT_TERM_T_FT,
	GTM_DUAL_RIGHT_FT,
	GTM_DUAL_RIGHT_RBRK_FT,
	GTM_DUAL_RIGHT_TERM_B_FT,
	GTM_DUAL_RIGHT_TERM_T_FT,
	GTM_GTY_RIGHT_RBRK_FT,
	GTP_CHANNEL_0,
	GTP_CHANNEL_0_MID_LEFT,
	GTP_CHANNEL_0_MID_RIGHT,
	GTP_CHANNEL_1,
	GTP_CHANNEL_1_MID_LEFT,
	GTP_CHANNEL_1_MID_RIGHT,
	GTP_CHANNEL_2,
	GTP_CHANNEL_2_MID_LEFT,
	GTP_CHANNEL_2_MID_RIGHT,
	GTP_CHANNEL_3,
	GTP_CHANNEL_3_MID_LEFT,
	GTP_CHANNEL_3_MID_RIGHT,
	GTP_COMMON,
	GTP_COMMON_MID_LEFT,
	GTP_COMMON_MID_RIGHT,
	GTP_INT_INTERFACE,
	GTP_INT_INTERFACE_L,
	GTP_INT_INTERFACE_R,
	GTP_INT_INT_TERM_L,
	GTP_INT_INT_TERM_R,
	GTP_MID_CHANNEL_STUB,
	GTP_MID_COMMON_STUB,
	GTX_CHANNEL_0,
	GTX_CHANNEL_1,
	GTX_CHANNEL_2,
	GTX_CHANNEL_3,
	GTX_COMMON,
	GTX_INT_INTERFACE,
	GTX_INT_INTERFACE_L,
	GTY_ALTO_TERM_L_FT,
	GTY_ALTO_TERM_L_RBRK_FT,
	GTY_ALTO_TERM_L_TERM_P_FT,
	GTY_ALTO_TERM_L_TERM_T_FT,
	GTY_DC0_TERM_L_FT,
	GTY_DC0_TERM_L_RBRK_FT,
	GTY_DC0_TERM_L_TERM_P_FT,
	GTY_DC0_TERM_L_TERM_T_FT,
	GTY_L,
	GTY_L_RBRK,
	GTY_L_TERM_B,
	GTY_L_TERM_T,
	GTY_QUAD_LEFT_DC0_TERM_P_FT,
	GTY_QUAD_LEFT_FT,
	GTY_QUAD_LEFT_RBRK_FT,
	GTY_QUAD_LEFT_TERM_B_FT,
	GTY_QUAD_LEFT_TERM_H_FT,
	GTY_QUAD_LEFT_TERM_P_FT,
	GTY_QUAD_LEFT_TERM_T_FT,
	GTY_QUAD_RIGHT_TERM_H_FT,
	GTY_QUAD_SINGLE,
	GTY_QUAD_SINGLE_MY,
	GTY_R,
	GTY_R_RBRK,
	GTY_R_TERM_B,
	GTY_R_TERM_T,
	GTZ_BOT,
	GTZ_BRAM,
	GTZ_CLB_INTF_IOB,
	GTZ_CLK,
	GTZ_CLK_B,
	GTZ_CMT,
	GTZ_DSP,
	GTZ_INT,
	GTZ_INT_L,
	GTZ_INT_LB,
	GTZ_INT_R,
	GTZ_INT_RB,
	GTZ_IOI,
	GTZ_TOP,
	GTZ_VBRK_INTF,
	HBM_DMAH_FT,
	HCLK_BRAM,
	HCLK_CLB,
	HCLK_CMT,
	HCLK_CMT_L,
	HCLK_DSP_L,
	HCLK_DSP_R,
	HCLK_FEEDTHRU_1,
	HCLK_FEEDTHRU_1_PELE,
	HCLK_FEEDTHRU_2,
	HCLK_FIFO_L,
	HCLK_GTX,
	HCLK_INT_INTERFACE,
	HCLK_IOB,
	HCLK_IOI,
	HCLK_IOI3,
	HCLK_L,
	HCLK_L_BOT_UTURN,
	HCLK_L_SLV,
	HCLK_L_TOP_UTURN,
	HCLK_R,
	HCLK_R_BOT_UTURN,
	HCLK_R_SLV,
	HCLK_R_TOP_UTURN,
	HCLK_TERM,
	HCLK_TERM_GTX,
	HCLK_VBRK,
	HCLK_VFRAME,
	HDIO_AMS_RBRK,
	HDIO_BOT_RIGHT,
	HDIO_HDIO_FILL_AMS_FILL_RBRK_FT,
	HDIO_HDIO_FILL_FT,
	HDIO_HDIO_FILL_PCIE4_RBRK_FT,
	HDIO_HDIO_FILL_RBRK_FT,
	HDIO_HDIO_FILL_TERM_T_FT,
	HDIO_HDIO_RIGHT_TERM_P_FT,
	HDIO_HDIO_RIGHT_TERM_RBRK_FT,
	HDIO_ILKN_RBRK_FT,
	HDIO_PCIE4_RBRK_FT,
	HDIO_RIGHT_CFG_TERM_T,
	HDIO_RIGHT_RBRK,
	HDIO_RIGHT_TERM_B,
	HDIO_RIGHT_TERM_T,
	HDIO_TILE,
	HDIO_TOP_RIGHT,
	HPHRIO_RBRK_L,
	HPIO_AMS_BOT_TERM_R,
	HPIO_AMS_BOT_TERM_R_GTH,
	HPIO_AMS_TOP_TERM_R,
	HPIO_AMS_TOP_TERM_R_GTH,
	HPIO_AUX_IO_TERM_L_BOT_DA6_FT,
	HPIO_AUX_IO_TERM_L_BOT_FT,
	HPIO_AUX_IO_TERM_L_TOP_DA6_FT,
	HPIO_AUX_IO_TERM_L_TOP_FT,
	HPIO_CBRK_IO,
	HPIO_CFG_BOT_TERM_R,
	HPIO_CFG_BOT_TERM_R_GTH,
	HPIO_CFG_TERM_L_BOT_FT,
	HPIO_CFG_TERM_L_TOP_FT,
	HPIO_CFG_TOP_TERM_R,
	HPIO_CFG_TOP_TERM_R_GTH,
	HPIO_HPIO_LEFT_TERM_B_L_FT,
	HPIO_HPIO_LEFT_TERM_P_FT,
	HPIO_HPIO_LEFT_TERM_T_L_FT,
	HPIO_HPIO_TERM_B_LEFT_OUTER_FT,
	HPIO_HPIO_TERM_H_FT,
	HPIO_HPIO_TERM_T_LEFT_OUTER_FT,
	HPIO_K3_TERM_L_FT,
	HPIO_K3_TERM_L_RBRK_FT,
	HPIO_K3_TERM_L_TERM_B_FT,
	HPIO_L,
	HPIO_L_RBRK,
	HPIO_L_TERM_B,
	HPIO_L_TERM_T,
	HPIO_RBRK_L,
	HPIO_RIGHT,
	HPIO_RIGHT_RBRK,
	HPIO_RIGHT_TERM_B,
	HPIO_RIGHT_TERM_T,
	HPIO_TERM_B_L,
	HPIO_TERM_L,
	HPIO_TERM_L_DA6_FT,
	HPIO_TERM_L_DA6_RBRK_FT,
	HPIO_TERM_L_DA6_TERM_P_FT,
	HPIO_TERM_L_DA6_TERM_T_FT,
	HPIO_TERM_L_FT,
	HPIO_TERM_L_RBRK,
	HPIO_TERM_L_RBRK_FT,
	HPIO_TERM_L_TERM_B_FT,
	HPIO_TERM_L_TERM_T_FT,
	HPIO_TERM_R_GTH_RBRK,
	HPIO_TERM_R_GTH_TERM_B,
	HPIO_TERM_R_RBRK,
	HPIO_TERM_R_TERM_B,
	HPIO_TERM_R_TERM_T,
	HPIO_TERM_T_L,
	HPIO_VH_TERM_L_FT,
	HPIO_VH_TERM_L_RBRK_FT,
	HPIO_VH_TERM_L_TERM_B_FT,
	HPIO_VH_TERM_L_TERM_T_FT,
	HRIO_L,
	HRIO_RBRK_L,
	HRIO_TERM_B_L,
	HSADC_HSADC_RIGHT_FT,
	HSADC_HSADC_RIGHT_RBRK_FT,
	HSADC_HSADC_RIGHT_TERM_B_FT,
	HSADC_HSC_FILL_RIGHT_FT,
	HSDAC_HSDAC_HSADC_RIGHT_RBRK_FT,
	HSDAC_HSDAC_RIGHT_FT,
	HSDAC_HSDAC_RIGHT_RBRK_FT,
	HSDAC_HSDAC_RIGHT_TERM_T_FT,
	HSM_AMS_SAT_LC,
	HSM_AMS_SAT_ME,
	HSM_AMS_SAT_ME_MX,
	ILKN_AMS_FILL_RBRK_FT,
	ILKN_AMS_RBRK_FT,
	ILKN_CMAC_RBRK_FT,
	ILKN_HDIO_FILL_RBRK_FT,
	ILKN_HDIO_RBRK_FT,
	ILKN_ILKN_CFG_TERM_T_FT,
	ILKN_ILKN_FT,
	ILKN_ILKN_RBRK_FT,
	ILKN_PCIE4_RBRK_FT,
	ILMAC_CMAC_ILMAC_LEFT_RBRK_FT,
	ILMAC_ILMAC_AMS_RBRK_FT,
	ILMAC_ILMAC_CMAC_LEFT_RBRK_FT,
	ILMAC_ILMAC_CMAC_RBRK_FT,
	ILMAC_ILMAC_FT,
	ILMAC_ILMAC_LEFT_TERM_B_FT,
	ILMAC_ILMAC_PCIE3_RBRK_FT,
	ILMAC_PCIE3_ILMAC_RBRK_FT,
	INT,
	INTF_CFRM_BL_TILE,
	INTF_CFRM_TL_TILE,
	INTF_GT_BL_TILE,
	INTF_GT_BR_TILE,
	INTF_GT_TL_TILE,
	INTF_GT_TR_TILE,
	INTF_HB_LOCF_BL_TILE,
	INTF_HB_LOCF_BR_TILE,
	INTF_HB_LOCF_TL_TILE,
	INTF_HB_LOCF_TR_TILE,
	INTF_HB_ROCF_BL_TILE,
	INTF_HB_ROCF_BR_TILE,
	INTF_HB_ROCF_TL_TILE,
	INTF_HB_ROCF_TR_TILE,
	INTF_HDIO_LOCF_TL_TILE,
	INTF_HDIO_LOCF_TR_TILE,
	INTF_HDIO_ROCF_TL_TILE,
	INTF_HDIO_ROCF_TR_TILE,
	INTF_LOCF_BL_TILE,
	INTF_LOCF_BR_TILE,
	INTF_LOCF_TL_TILE,
	INTF_LOCF_TR_TILE,
	INTF_PSS_BL_TILE,
	INTF_PSS_TL_TILE,
	INTF_ROCF_BL_TILE,
	INTF_ROCF_BR_TILE,
	INTF_ROCF_TL_TILE,
	INTF_ROCF_TR_TILE,
	INT_FEEDTHRU_1,
	INT_FEEDTHRU_2,
	INT_IBRK_FSR2FE_FT,
	INT_IBRK_FSR2FE_RBRK_FT,
	INT_IBRK_FSR2FE_TERM_B_FT,
	INT_IBRK_FSR2FE_TERM_T_FT,
	INT_IBRK_FSR2IO,
	INT_IBRK_FSR2IO_R,
	INT_IBRK_FSR2IO_RBRK,
	INT_IBRK_FSR2IO_RBRK_R,
	INT_IBRK_FSR2IO_TERM_B,
	INT_IBRK_FSR2IO_TERM_B_L_FT,
	INT_IBRK_FSR2IO_TERM_B_R,
	INT_IBRK_FSR2IO_TERM_H_FT,
	INT_IBRK_FSR2IO_TERM_P_FT,
	INT_IBRK_FSR2IO_TERM_T,
	INT_IBRK_FSR2IO_TERM_T_L_FT,
	INT_IBRK_FSRIO_TERM_T_R,
	INT_IBRK_IO,
	INT_IBRK_IO2XIPHY,
	INT_IBRK_IO_R,
	INT_IBRK_IO_RBRK,
	INT_IBRK_IO_R_RBRK,
	INT_IBRK_IO_R_TERM_T,
	INT_IBRK_IO_TERM_B,
	INT_IBRK_IO_TERM_P_FT,
	INT_IBRK_IO_TERM_T,
	INT_IBRK_LEFT_L_FT,
	INT_IBRK_L_R,
	INT_IBRK_RBRK_FSR2IO,
	INT_IBRK_RBRK_IO2XIPHY,
	INT_IBRK_RBRK_LEFT_L_FT,
	INT_IBRK_RBRK_L_R,
	INT_IBRK_RBRK_R_L,
	INT_IBRK_RBRK_XIPHY2INT,
	INT_IBRK_R_L,
	INT_IBRK_R_TERM_B,
	INT_IBRK_TERM_B_FSR2IO,
	INT_IBRK_TERM_B_IO2XIPHY,
	INT_IBRK_TERM_B_LEFT_L_FT,
	INT_IBRK_TERM_B_L_R,
	INT_IBRK_TERM_B_OUTER_FT,
	INT_IBRK_TERM_B_R_L,
	INT_IBRK_TERM_B_XIPHY2INT,
	INT_IBRK_TERM_T_FSR2IO,
	INT_IBRK_TERM_T_IO2XIPHY,
	INT_IBRK_TERM_T_LEFT_L_FT,
	INT_IBRK_TERM_T_L_R,
	INT_IBRK_TERM_T_OUTER_FT,
	INT_IBRK_TERM_T_R_L,
	INT_IBRK_TERM_T_XIPHY2INT,
	INT_IBRK_XIPHY2INT,
	INT_INTERFACE_GT_R,
	INT_INTERFACE_GT_R_RBRK,
	INT_INTERFACE_GT_R_TERM_B,
	INT_INTERFACE_GT_R_TERM_T,
	INT_INTERFACE_L,
	INT_INTERFACE_L_RBRK,
	INT_INTERFACE_L_TERM_B,
	INT_INTERFACE_L_TERM_T,
	INT_INTERFACE_PCIE_L,
	INT_INTERFACE_PCIE_L_RBRK,
	INT_INTERFACE_PCIE_L_TERM_B,
	INT_INTERFACE_PCIE_L_TERM_T,
	INT_INTERFACE_PCIE_R,
	INT_INTERFACE_PCIE_R_RBRK,
	INT_INTERFACE_PCIE_R_TERM_B,
	INT_INTERFACE_PCIE_R_TERM_T,
	INT_INTERFACE_PSS_L,
	INT_INTERFACE_R,
	INT_INTERFACE_R_RBRK,
	INT_INTERFACE_R_TERM_B,
	INT_INTERFACE_R_TERM_T,
	INT_INTF_L,
	INT_INTF_LEFT_IBRK_IO_TERM_H_FT,
	INT_INTF_LEFT_IBRK_PCIE4_TERM_H_FT,
	INT_INTF_LEFT_IBRK_PCIE4_TERM_P_FT,
	INT_INTF_LEFT_TERM_GT_TERM_H_FT,
	INT_INTF_LEFT_TERM_GT_TERM_P,
	INT_INTF_LEFT_TERM_H_FT,
	INT_INTF_LEFT_TERM_IO_FT,
	INT_INTF_LEFT_TERM_IO_RBRK_FT,
	INT_INTF_LEFT_TERM_IO_TERM_B_FT,
	INT_INTF_LEFT_TERM_IO_TERM_P_FT,
	INT_INTF_LEFT_TERM_IO_TERM_T_FT,
	INT_INTF_LEFT_TERM_P,
	INT_INTF_LEFT_TERM_PSS,
	INT_INTF_LEFT_TERM_PSS_RBRK,
	INT_INTF_LEFT_TERM_PSS_TERM_B,
	INT_INTF_LEFT_TERM_PSS_TERM_T,
	INT_INTF_LEFT_TERM_PSS_TERM_V_FT,
	INT_INTF_L_CMT,
	INT_INTF_L_IO,
	INT_INTF_L_IO_RBRK,
	INT_INTF_L_IO_TERM_B,
	INT_INTF_L_IO_TERM_T,
	INT_INTF_L_PCIE4,
	INT_INTF_L_PCIE4_RBRK,
	INT_INTF_L_PCIE4_TERM_B,
	INT_INTF_L_PCIE4_TERM_T,
	INT_INTF_L_RBRK,
	INT_INTF_L_TERM_B,
	INT_INTF_L_TERM_GT,
	INT_INTF_L_TERM_GT_RBRK,
	INT_INTF_L_TERM_G_TERM_B,
	INT_INTF_L_TERM_G_TERM_T,
	INT_INTF_L_TERM_T,
	INT_INTF_R,
	INT_INTF_RIGHT_IBRK_PCIE4_TERM_H_FT,
	INT_INTF_RIGHT_IBRK_PCIE4_TERM_P_FT,
	INT_INTF_RIGHT_IO_RBRK,
	INT_INTF_RIGHT_IO_TERM_B,
	INT_INTF_RIGHT_TERM_GT_IO_RBRK,
	INT_INTF_RIGHT_TERM_GT_TERM_H_FT,
	INT_INTF_RIGHT_TERM_H_FT,
	INT_INTF_RIGHT_TERM_IO,
	INT_INTF_RIGHT_TERM_IO_TERM_T,
	INT_INTF_RIGHT_TERM_P,
	INT_INTF_R_PCIE4,
	INT_INTF_R_PCIE4_RBRK,
	INT_INTF_R_PCIE4_TERM_B,
	INT_INTF_R_PCIE4_TERM_T,
	INT_INTF_R_RBRK,
	INT_INTF_R_TERM_B,
	INT_INTF_R_TERM_GT,
	INT_INTF_R_TERM_GT_RBRK,
	INT_INTF_R_TERM_GT_TERM_B,
	INT_INTF_R_TERM_GT_TERM_T,
	INT_INTF_R_TERM_T,
	INT_INT_INTERFACE_GT_LEFT_FT,
	INT_INT_INTERFACE_GT_LEFT_RBRK_FT,
	INT_INT_INTERFACE_GT_LEFT_TERM_B_FT,
	INT_INT_INTERFACE_GT_LEFT_TERM_T_FT,
	INT_INT_INTERFACE_XIPHY_FT,
	INT_INT_INTERFACE_XIPHY_RBRK_FT,
	INT_INT_INTERFACE_XIPHY_TERM_B_FT,
	INT_INT_INTERFACE_XIPHY_TERM_T_FT,
	INT_INT_TERM_H_FT,
	INT_L,
	INT_L_SLV,
	INT_L_SLV_FLY,
	INT_R,
	INT_RBRK,
	INT_R_SLV,
	INT_R_SLV_FLY,
	INT_TERM_B,
	INT_TERM_IO_TERM_T,
	INT_TERM_L_IO,
	INT_TERM_L_IO_RBRK,
	INT_TERM_L_IO_TERM_B,
	INT_TERM_P,
	INT_TERM_T,
	IO_INT_INTERFACE_L,
	IO_INT_INTERFACE_R,
	LAGUNA_TERM_B,
	LAGUNA_TERM_T,
	LAGUNA_TILE,
	LAG_C2L_RBRK,
	LAG_CLEM2LAGUNA_RBRK_FT,
	LAG_LAG,
	LAG_LAG2C_RBRK,
	LAG_LAGUNA2CLEM_RBRK_FT,
	LAG_LAG_TERM_B,
	LAG_LAG_TERM_T,
	LIOB18,
	LIOB18_SING,
	LIOB33,
	LIOB33_SING,
	LIOI,
	LIOI3,
	LIOI3_SING,
	LIOI3_TBYTESRC,
	LIOI3_TBYTETERM,
	LIOI_SING,
	LIOI_TBYTESRC,
	LIOI_TBYTETERM,
	L_TERM_INT,
	L_TERM_INT_BRAM,
	MISC_GT_REBUF_TILE,
	MISC_GT_REBUF_TILE_MY,
	MISR_TILE,
	MONITOR_BOT,
	MONITOR_BOT_FUJI2,
	MONITOR_BOT_PELE1,
	MONITOR_BOT_SLAVE,
	MONITOR_MID,
	MONITOR_MID_FUJI2,
	MONITOR_MID_PELE1,
	MONITOR_TOP,
	MONITOR_TOP_FUJI2,
	MONITOR_TOP_PELE1,
	MRMAC_BOT_TILE,
	MRMAC_TOP_TILE,
	NOC_HNOC_S3_PL_CORE,
	NOC_HNOC_S3_PS_CORE,
	NOC_NMU512_TOP,
	NOC_NPS_VNOC_TOP,
	NOC_NSU512_TOP,
	NOC_PNOC_MONO_CORE,
	NOC_TNOC_ME_CORE,
	NOC_TNOC_ME_CORE_MX,
	NOC_TNOC_ME_CORE_R180,
	NOC_TNOC_NCRB_CORE,
	NOC_TNOC_NCRB_CORE_MX,
	NOC_TNOC_S2_CORE,
	NOC_TNOC_S2_CORE_MX,
	NPI_VNPI_BOT_TILE,
	NPI_VNPI_BOT_TILE_MY,
	NPI_VNPI_TOP_TILE,
	NPI_VNPI_TOP_TILE_MY,
	NULL,
	PCIE,
	PCIE3_BOT_RIGHT,
	PCIE3_INT_INTERFACE_L,
	PCIE3_INT_INTERFACE_R,
	PCIE3_RIGHT,
	PCIE3_TOP_RIGHT,
	PCIE4C_PCIE4C_FT,
	PCIE4_AMS_FILL_RBRK_FT,
	PCIE4_AMS_RBRK_FT,
	PCIE4_CFG_TERM_T_FT,
	PCIE4_CMAC_RBRK_FT,
	PCIE4_HDIO_FILL_RBRK_FT,
	PCIE4_HDIO_RBRK_FT,
	PCIE4_PCIE4_FT,
	PCIE4_PCIE4_RBRK_FT,
	PCIE4_TERM_B_FT,
	PCIE4_TERM_H_FT,
	PCIE4_TERM_T_FT,
	PCIEB_BOT_TILE,
	PCIEB_TOP_TILE,
	PCIE_BOT,
	PCIE_BOT_LEFT,
	PCIE_INT_INTERFACE_L,
	PCIE_INT_INTERFACE_LEFT_L,
	PCIE_INT_INTERFACE_R,
	PCIE_NULL,
	PCIE_TOP,
	PCIE_TOP_LEFT,
	PSS0,
	PSS1,
	PSS2,
	PSS3,
	PSS4,
	PSS_ALTO,
	PSS_ALTO_TERM_B,
	PSS_ALTO_TERM_T,
	PSS_ALTO_VCU_DA6_RBRK_FT,
	PSS_BASE_CORE,
	PSS_DA6_FILL_ALTO_FT,
	PSS_GTH_FILL_DA0_FT,
	PSS_GTH_FILL_DA0_TERM_B_FT,
	PSS_GTH_FILL_DA7,
	PSS_GTH_FILL_DA7_TERM_B,
	PSS_GTY_FILL_ALTO_FT,
	PSS_GTY_FILL_ALTO_TERM_B_FT,
	PSS_VCU_DA6_FILL_ALTO_RBRK_FT,
	RBRK_BRAM_TILE,
	RBRK_BRAM_TILE_MY,
	RBRK_CBRK_CORE,
	RBRK_CFRM_CORE,
	RBRK_CLE_CORE,
	RBRK_CPIPE_CORE,
	RBRK_CPIPE_CORE_MY,
	RBRK_CPM_EXT_CORE,
	RBRK_DSP_CORE,
	RBRK_GTCLK_CORE,
	RBRK_GTCLK_CORE_MY,
	RBRK_GTY_CORE,
	RBRK_GTY_CORE_MY,
	RBRK_GT_DECAP_TILE,
	RBRK_GT_DECAP_TILE_MY,
	RBRK_HB_CORE,
	RBRK_HB_HFSR_CORE,
	RBRK_INTF_CFRM_CORE,
	RBRK_INTF_CORE,
	RBRK_INTF_CORE_MY,
	RBRK_INTF_GT_CORE,
	RBRK_INTF_GT_CORE_MY,
	RBRK_INTF_HB_CORE,
	RBRK_INTF_HB_CORE_MY,
	RBRK_INT_TILE,
	RBRK_URAM_TILE,
	RBRK_URAM_TILE_MY,
	RBRK_VNOC_CORE,
	RBRK_VNOC_DECAP_CORE,
	RBRK_XPIPE_CORE,
	RCLK_AMS_CFGIO,
	RCLK_BRAM_CLKBUF_CORE,
	RCLK_BRAM_CORE,
	RCLK_BRAM_CORE_MY,
	RCLK_BRAM_INTF_L,
	RCLK_BRAM_INTF_TD_L,
	RCLK_BRAM_INTF_TD_R,
	RCLK_BRAM_L,
	RCLK_BRAM_R,
	RCLK_CBRK_HB_L_CORE,
	RCLK_CBRK_HB_R_CORE,
	RCLK_CBRK_IO,
	RCLK_CBRK_IO_M12BUF_R,
	RCLK_CBRK_L,
	RCLK_CBRK_L_CORE,
	RCLK_CBRK_M12BUF_L,
	RCLK_CBRK_M12BUF_R,
	RCLK_CBRK_R,
	RCLK_CBRK_R_CORE,
	RCLK_CLEL_L,
	RCLK_CLEL_L_L,
	RCLK_CLEL_L_R,
	RCLK_CLEL_R,
	RCLK_CLEL_R_DCG10_R,
	RCLK_CLEL_R_L,
	RCLK_CLEL_R_R,
	RCLK_CLEM_CLKBUF_L,
	RCLK_CLEM_DMC_L,
	RCLK_CLEM_L,
	RCLK_CLEM_R,
	RCLK_CLE_CORE,
	RCLK_CLE_M_L,
	RCLK_CLE_M_R,
	RCLK_CPIPE_CORE,
	RCLK_DSP_CLKBUF_L,
	RCLK_DSP_CORE,
	RCLK_DSP_INTF_CLKBUF_L,
	RCLK_DSP_INTF_L,
	RCLK_DSP_INTF_R,
	RCLK_DSP_L,
	RCLK_DSP_R,
	RCLK_GAP4,
	RCLK_HB_CORE,
	RCLK_HDIO,
	RCLK_HDIO_CORE,
	RCLK_HPIO_L,
	RCLK_HPIO_R,
	RCLK_HPIO_TERM_R,
	RCLK_HPIO_TERM_R_GTH,
	RCLK_HRIO_L,
	RCLK_IBRK_FSR2IO,
	RCLK_IBRK_FSR2IO_R,
	RCLK_IBRK_IO,
	RCLK_IBRK_IO2XIPHY,
	RCLK_IBRK_IO_R,
	RCLK_IBRK_L_R,
	RCLK_IBRK_R_L,
	RCLK_IBRK_XIPHY2INT,
	RCLK_INTF_GT_R_R,
	RCLK_INTF_LEFT_TERM_ALTO,
	RCLK_INTF_LEFT_TERM_DA7,
	RCLK_INTF_L_CORE,
	RCLK_INTF_L_IBRK_IO_L,
	RCLK_INTF_L_IBRK_PCIE4_L,
	RCLK_INTF_L_IBRK_PCIE4_R,
	RCLK_INTF_L_L,
	RCLK_INTF_L_R,
	RCLK_INTF_L_TERM_GT,
	RCLK_INTF_OPT_CORE,
	RCLK_INTF_PCIE_L_R,
	RCLK_INTF_PCIE_R_L,
	RCLK_INTF_RIGHT_TERM_GT_IO,
	RCLK_INTF_RIGHT_TERM_IO,
	RCLK_INTF_R_CORE,
	RCLK_INTF_R_IBRK_L,
	RCLK_INTF_R_L,
	RCLK_INTF_R_R,
	RCLK_INTF_R_TERM_GT,
	RCLK_INTF_TERM_LEFT_CORE,
	RCLK_INTF_TERM_RIGHT_CORE,
	RCLK_INT_L,
	RCLK_INT_L_FT,
	RCLK_INT_R,
	RCLK_INT_R_FT,
	RCLK_INT_TERM_L,
	RCLK_LAG_DMC_L,
	RCLK_LAG_L,
	RCLK_LAG_R,
	RCLK_RCLK_BRAM_L_AUXCLMP_FT,
	RCLK_RCLK_BRAM_L_BRAMCLMP_FT,
	RCLK_RCLK_CBRK_CTR_LEFT_M12BUF_L_FT,
	RCLK_RCLK_CBRK_CTR_RIGHT_M12BUF_L_FT,
	RCLK_RCLK_CBRK_IO_M12BUF_L_FT,
	RCLK_RCLK_CLE_M_DECAP_DMC_L_FT,
	RCLK_RCLK_CLE_M_DECAP_L_FT,
	RCLK_RCLK_CLE_M_DECAP_R_FT,
	RCLK_RCLK_CTR_FILL_FT,
	RCLK_RCLK_DSP_INTF_DC12_L_FT,
	RCLK_RCLK_DSP_INTF_DC12_R_FT,
	RCLK_RCLK_GAP50_MINICBRK_FT,
	RCLK_RCLK_HPIO_TERM_L_DA6_FT,
	RCLK_RCLK_HPIO_TERM_L_FT,
	RCLK_RCLK_IBRK_FSR2FE_FT,
	RCLK_RCLK_IBRK_LEFT_L_FT,
	RCLK_RCLK_INTF_GTH_LEFT_L_FT,
	RCLK_RCLK_INTF_GT_LEFT_L_FT,
	RCLK_RCLK_INTF_LEFT_IBRK_FE_L_FT,
	RCLK_RCLK_INTF_LEFT_TERM_DA0_FT,
	RCLK_RCLK_INTF_LEFT_TERM_DA6_FT,
	RCLK_RCLK_INTF_LEFT_TERM_DA8_FT,
	RCLK_RCLK_INTF_LEFT_TERM_DC12_FT,
	RCLK_RCLK_INTF_LEFT_TERM_IO_FT,
	RCLK_RCLK_INTF_PCIE3_LEFT_L_FT,
	RCLK_RCLK_INTF_XIPHY_LEFT_L_FT,
	RCLK_RCLK_K3_TERM_L_FT,
	RCLK_RCLK_LAGUNA_L_FT,
	RCLK_RCLK_LAGUNA_R_FT,
	RCLK_RCLK_URAM_INTF_L_FT,
	RCLK_RCLK_VH_TERM_L_FT,
	RCLK_RCLK_XIPHY_INNER_FT,
	RCLK_TERM_L,
	RCLK_URAM_CORE,
	RCLK_URAM_CORE_MY,
	RCLK_XIPHY_OUTER_RIGHT,
	REBUF_BRAM_BLI_T_CORE,
	REBUF_BRAM_B_CORE,
	REBUF_BRAM_B_CORE_MY,
	REBUF_BRAM_T_CORE,
	REBUF_BRAM_T_CORE_MY,
	REBUF_CLE_BLI_B_CORE,
	REBUF_CLE_BLI_T_CORE,
	REBUF_CLE_B_CORE,
	REBUF_CLE_T_CORE,
	REBUF_DSP_BLI_B_CORE,
	REBUF_DSP_BLI_T_CORE,
	REBUF_DSP_B_CORE,
	REBUF_DSP_T_CORE,
	REBUF_INTF_B_CORE,
	REBUF_INTF_B_CORE_MY,
	REBUF_INTF_CFRM_OPTDLY_B_CORE,
	REBUF_INTF_CFRM_OPTDLY_T_CORE,
	REBUF_INTF_GT_OPTDLY_B_CORE,
	REBUF_INTF_GT_OPTDLY_B_CORE_MY,
	REBUF_INTF_GT_OPTDLY_T_CORE,
	REBUF_INTF_GT_OPTDLY_T_CORE_MY,
	REBUF_INTF_HB_B_CORE,
	REBUF_INTF_HB_B_CORE_MY,
	REBUF_INTF_HB_T_CORE,
	REBUF_INTF_HB_T_CORE_MY,
	REBUF_INTF_IBRK_OPTDLY_HDIO_T_CORE,
	REBUF_INTF_IBRK_OPTDLY_HDIO_T_CORE_MY,
	REBUF_INTF_PSS_OPTDLY_B_CORE,
	REBUF_INTF_PSS_OPTDLY_T_CORE,
	REBUF_INTF_T_CORE,
	REBUF_INTF_T_CORE_MY,
	REBUF_INT_B_CORE,
	REBUF_INT_T_CORE,
	REBUF_URAM_BLI_T_CORE,
	REBUF_URAM_BLI_T_CORE_MY,
	REBUF_URAM_B_CORE,
	REBUF_URAM_B_CORE_MY,
	REBUF_URAM_T_CORE,
	REBUF_URAM_T_CORE_MY,
	RFADC_RFADC_RIGHT_FT,
	RFADC_RFADC_RIGHT_RBRK_FT,
	RFADC_RFADC_RIGHT_TERM_B_FT,
	RFDAC_RFDAC_RFADC_RIGHT_RBRK_FT,
	RFDAC_RFDAC_RIGHT_FT,
	RFDAC_RFDAC_RIGHT_RBRK_FT,
	RFDAC_RFDAC_RIGHT_TERM_T_FT,
	RIOB18,
	RIOB18_SING,
	RIOB33,
	RIOB33_SING,
	RIOI,
	RIOI3,
	RIOI3_SING,
	RIOI3_TBYTESRC,
	RIOI3_TBYTETERM,
	RIOI_SING,
	RIOI_TBYTESRC,
	RIOI_TBYTETERM,
	R_TERM_INT,
	R_TERM_INT_GTX,
	TERM_B_BLI_CLE_TILE,
	TERM_B_BLI_DSP_TILE,
	TERM_B_BRAM_CORE,
	TERM_B_BRAM_CORE_MY,
	TERM_B_CBRK_CORE,
	TERM_B_CFRM_CORE,
	TERM_B_CPIPE_CORE,
	TERM_B_GTCLK_CORE,
	TERM_B_GTY_CORE,
	TERM_B_HB_CORE,
	TERM_B_INTF_CFRM_CORE,
	TERM_B_INTF_CORE,
	TERM_B_INTF_CORE_MY,
	TERM_B_INTF_GT_CORE,
	TERM_B_INTF_HB_CORE,
	TERM_B_INTF_HB_CORE_MY,
	TERM_B_INT_TILE,
	TERM_B_PSS_DECAP_CORE,
	TERM_B_PSS_TILE,
	TERM_B_URAM_CORE,
	TERM_B_URAM_CORE_MY,
	TERM_B_VNOC_CORE,
	TERM_B_VNOC_FIRST_CORE,
	TERM_CMT,
	TERM_P_BRAM_CORE,
	TERM_P_CBRK_CORE,
	TERM_P_CLE_CORE,
	TERM_P_CPIPE_CORE,
	TERM_P_GTCLK_CORE,
	TERM_P_GTY_CORE,
	TERM_P_HB_CORE,
	TERM_P_INTF_CORE,
	TERM_P_INTF_CORE_MY,
	TERM_P_INTF_GT_CORE,
	TERM_P_INTF_HB_CORE,
	TERM_P_INTF_HB_CORE_MY,
	TERM_P_INT_TILE,
	TERM_P_URAM_CORE,
	TERM_P_URAM_CORE_MY,
	TERM_P_XPIPE_CORE,
	TERM_T_BLI_BRAM_TILE,
	TERM_T_BLI_CLE_TILE,
	TERM_T_BLI_DSP_TILE,
	TERM_T_BLI_URAM_TILE,
	TERM_T_BRAM_CORE,
	TERM_T_BRAM_CORE_MY,
	TERM_T_CBRK_CORE,
	TERM_T_CBRK_CORE_MY,
	TERM_T_CBRK_LOVN_CORE,
	TERM_T_CFRM_CORE,
	TERM_T_CPIPE_L_CORE,
	TERM_T_CPIPE_M_CORE,
	TERM_T_CPIPE_R_CORE,
	TERM_T_GTCLK_L_CORE,
	TERM_T_GTCLK_R_CORE,
	TERM_T_GTY_L_CORE,
	TERM_T_GTY_R_CORE,
	TERM_T_HDIO_L_CORE,
	TERM_T_HDIO_R_CORE,
	TERM_T_INTF_CFRM_CORE,
	TERM_T_INTF_CORE,
	TERM_T_INTF_CORE_MY,
	TERM_T_INTF_GT_CORE,
	TERM_T_INTF_GT_CORE_MY,
	TERM_T_INTF_HDIO_CORE,
	TERM_T_INTF_HDIO_CORE_MY,
	TERM_T_INT_TILE,
	TERM_T_URAM_CORE,
	TERM_T_URAM_CORE_MY,
	TERM_T_VNOC_CORE,
	TERM_T_VNOC_FIRST_CORE,
	TERM_T_XPIPE_CORE,
	T_TERM_INT,
	T_TERM_INT_NOUTURN,
	T_TERM_INT_SLV,
	URAM_DELAY_LOCF_TL_TILE,
	URAM_DELAY_ROCF_TL_TILE,
	URAM_LOCF_BL_TILE,
	URAM_LOCF_TL_TILE,
	URAM_ROCF_BL_TILE,
	URAM_ROCF_TL_TILE,
	URAM_URAM_DELAY_FT,
	URAM_URAM_FT,
	URAM_URAM_RBRK_FT,
	URAM_URAM_TERM_B_FT,
	URAM_URAM_TERM_H_FT,
	URAM_URAM_TERM_P_FT,
	URAM_URAM_TERM_T_FT,
	VBRK,
	VBRK_EXT,
	VCU_DA6_FILL_FT,
	VCU_VCU_DA4_TERM_V_FT,
	VCU_VCU_DA6_TERM_V_FT,
	VCU_VCU_FT,
	VCU_VCU_TERM_V_FT,
	VFRAME,
	XIPHY_BYTE_L,
	XIPHY_BYTE_RIGHT,
	XIPHY_L,
	XIPHY_L_RBRK,
	XIPHY_L_TERM_B,
	XIPHY_L_TERM_T,
	XIPHY_RIGHT_RBRK,
	XIPHY_RIGHT_TERM_R_FT,
	XIPHY_RIGHT_TERM_T_FT,
	XIPHY_XIPHY_LEFT_TERM_P_FT,
	XPIO_MISC_CORE,
	XPIO_NIBBLE_SC,
	XPIO_NIBBLE_SC_MY,
	XPIPE_QUAD_SINGLE,
}
